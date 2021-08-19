import java.util.*;
public class gcd {
    //Get GCD of two numbers
    public static int getGCD(int a, int b) {
        if(b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD = " + getGCD(a, b));
    }
}
