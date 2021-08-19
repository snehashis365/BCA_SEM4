import java.util.*;
public class student {
    String name;
    int marks[];
    int avg;
    public student() {
        name = "";
        marks = new int[5];
        avg = 0;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(int marks[]) {
        this.marks = marks;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println("\nAverage: " + avg);
    }
    public void calcAvg() {
        avg = 0;
        for (int i = 0; i < 5; i++) {
            avg = avg + marks[i];
        }
        avg = avg / 5;
    }
    // Main method
    public static void main(String args[]) {
        student s1 = new student();
        s1.setName("Sachin");
        s1.setMarks(new int[]{70, 79, 95, 88, 65});
        s1.calcAvg();
        s1.display();
    }
}
