public class pattern {
    public static void main(String args[]) {
        // i for rows and j for columns
        // row denotes the number of rows you want to print
        int i, j, row = 4, count = 1;
        // Outer loop work for rows
        for (i = 0; i < row; i++) {
            // inner loop work for space
            for (j = row - i; j > 1; j--) {
                // prints space between two stars
                System.out.print("  ");
            }
            // inner loop for columns
            for (j = 0; j < count; j++) {
                int tmp = i + 1;
                System.out.print(tmp + " ");
            }
            count += 2;
            System.out.println();
        }
    }
}