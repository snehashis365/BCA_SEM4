import java.util.*;

interface Discolor{
    public void discolor(String name);
}

interface DisPrice{
    int unitPrice=200;
    public void disPrice();
}

public class Quantity{
    int x;
    Quantity(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Qty: ");
        x=sc.nextInt();
    }
    public int getQuantity(){
        return x;
    }
}

class PriceColor extends Quantity implements DisPrice,Discolor{

    Scanner sc=new Scanner(System.in);
    String color;

    public void discolor(String name){
        System.out.println(name);
    }

    public void disPrice(){
        System.out.println(super.getQuantity()*unitPrice);
    }

    String getColor(){
        System.out.print("Color: ");
        color=sc.nextLine();
        return color;
    }

    public static void main(String[] args) {
        PriceColor priceColor=new PriceColor();
        priceColor.discolor(priceColor.getColor());
        priceColor.disPrice();
    }
}