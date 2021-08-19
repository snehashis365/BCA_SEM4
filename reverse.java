import java.util.*;
public class reverse {
    //Reverse a character array
    public static char[] reverseArr(char[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char arr[] = new char[20];
        System.out.println("Enter 20 characters: ");
        for(int i = 0; i < 20; i++)
            arr[i] = in.next().charAt(0);
        System.out.println("Reversed array:\n" + Arrays.toString(reverseArr(arr)));
    }
}
