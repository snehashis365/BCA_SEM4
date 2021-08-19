/*Write a program for user-defined exception that checks internal & external marks. If the
internal marks is greater than 40 it raises the exception „InternalMarkExceedsException‟.
If the external marks is greater than 60 then „ExternalMarkExceedsException‟ will be
raised.*/
import java.util.Scanner;
class InternalMarkExceedsException extends Exception
{
    public InternalMarkExceedsException(String message)
    {
        super(message);
    }
}
class ExternalMarkExceedsException extends Exception
{
    public ExternalMarkExceedsException(String message)
    {
        super(message);
    }
}

public class user_exception {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int marks = 0;
            System.out.println("Enter the marks of the student");
            marks = sc.nextInt();
            if (marks > 40) {
                throw new InternalMarkExceedsException("Internal marks exceeds 40");
            }
            if (marks > 60) {
                throw new ExternalMarkExceedsException("External marks exceeds 60");
            }
        } catch (InternalMarkExceedsException e) {
            e.printStackTrace();
        } catch (ExternalMarkExceedsException e) {
            e.printStackTrace();
        }
    }
}
