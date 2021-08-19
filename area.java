import java.util.*;
public class area {
    //Overload area function to calcualte area of a rectangle, square, triangle and circle
    public static double getArea(int side, int height) {
        return side * height;
    }
    public static double getArea(int side) {
        return side * side;
    }
    public static double getArea(double side, double height, double base) {
        return side * height + base * base;
    }
    public static double getArea(double radius) {
        return Math.PI * radius * radius;
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input side of square
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        //calculate area of square
        System.out.println("Area of square: " + getArea(side));
        //input side and height of rectangle
        System.out.print("Enter the side of the rectangle: ");
        side = sc.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        int height = sc.nextInt();
        //calculate area of rectangle
        System.out.println("Area of rectangle is: " + getArea(side, height));
        //input side and radius of circle
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        //calculate area of circle
        System.out.println("Area of circle is: " + getArea(radius));
        //input side and base of triangle
        System.out.print("Enter the side of the triangle: ");
        side = sc.nextInt();
        System.out.print("Enter the base of the triangle: ");
        int base = sc.nextInt();
        //calculate area of triangle
        System.out.println("Area of triangle is: " + getArea(side, base));
    }
}
