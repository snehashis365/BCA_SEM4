import java.util.*;
public class quadratic {
    //calculate the roots of a quadratic equation
    public static double[] quadratic(double a, double b, double c) {
        double[] roots = new double[2];
        roots[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        roots[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return roots;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        double[] roots = quadratic(a, b, c);
        System.out.println("Roots are " + roots[0] + " and " + roots[1]);
    }
}
