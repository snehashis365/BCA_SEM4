import java.util.*;
public class pallindrome {
    //check string is palindrome or not
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    //main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        if(isPalindrome(str))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
