public class exception_null {
   /*Write a code segment that result a “NullPointerException”. Write necessary catch block
to catch it. Also write a finally block. Write appropriate statements in it.*/
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } finally {
            System.out.println("Finally block");
        }
    }
}
