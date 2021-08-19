import java.util.*;
public class fibonacci {
    //Print fibonacci sequence
    static void printFibonacci(int n) {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " ");
        if(n==1)
            return;
        System.out.print(b + " ");
        if(n==2)
            return;
        for(int i=3; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
    //Main function
    public static void main(String[] args) {
        System.out.print("Enter the number of terms to be printed: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printFibonacci(n);
    }
}
