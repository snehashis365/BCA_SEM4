abstract class A {
    int base;
    int height;
    double area;
    public A(int base, int height) {
        this.base = base;
        this.height = height;
        this.area = base * height;
    }
    public abstract double area();
}
public class triangle extends A {
    public triangle(int base, int height) {
        super(base, height);
        
    }
    public double area() {
        area = base * height / 2;
        return area;
    }
    //main method
    public static void main(String[] args) {
        triangle t = new triangle(5, 6);
        System.out.println("Area : " + t.area());
    }
}
