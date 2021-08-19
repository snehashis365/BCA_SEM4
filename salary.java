import java.util.*;
public class salary {
    //calculate the salary of a employee
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        int salary = x<40?4*x+100:x==40?300:(int)4.5*x +150;
        System.out.println("The salary is: "+salary);
    }      
}
