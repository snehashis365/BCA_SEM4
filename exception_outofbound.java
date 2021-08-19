public class exception_outofbound {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        try {
            arr[15] = 15;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}