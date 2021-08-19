public class exception_zero {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = x / 0;
        } catch (Exception e) {
            //print origin of e
            e.printStackTrace();
        }
    }
}
