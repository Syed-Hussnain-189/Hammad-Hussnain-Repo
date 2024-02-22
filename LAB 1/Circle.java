import java.util.Scanner;

public class Circle {

    public double calculateArea(double radius) {
        return (Math.PI * radius * radius);
    }

    public double calculatePerimeter(double radius){
        return (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Radius is: ");
        double radius = input.nextDouble();

        Circle area = new Circle();
        double calRad = area.calculateArea(radius);
        double perimeter = area.calculatePerimeter(radius);

        System.out.printf("Area is: %.2f\n", calRad);
        System.out.printf("Perimeter is: %.2f\n", perimeter);

        input.close();
    }
}