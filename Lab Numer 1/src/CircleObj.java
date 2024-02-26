import java.util.*;
public class CircleObj {
    static double r;
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter The Radius");
        r = s1.nextDouble();

        Circle c1 = new Circle();
        c1.setradius(r);
        c1.calculateArea();
        c1.calculatePerimeter();
    }
}
