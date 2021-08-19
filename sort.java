import java.util.*;
public class sort {
    //Bubble Sort
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = new int[15];
        System.out.println("Enter 15 array elements(int):");
        for(int i = 0; i < 15; i++) {
            array[i] = sc.nextInt();
        }
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
