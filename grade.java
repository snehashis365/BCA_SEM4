import java.util.*;
public class grade {
    public static String getGrade(int marks) {
        switch (marks/10) {
        case 10:
        case 9:
        case 8:
        return "Honours";
        case 7:
        case 6:
        return "First Division";
        case 5:
        return "Second Division";
        case 4:
        return "Third Division";
        default:
        return "Fail";
        }
    }
    //Main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Average marks: ");
        int marks = in.nextInt();
        System.out.print("Grade: " + getGrade(marks));
    }
}
