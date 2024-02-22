import java.util.Scanner;

public class Rectangle {

    public double calculateArea(double length, double width) {
        return (length * width);
    }

    public double calculatePerimeter(double length, double width){
        return (2*length + 2*width);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length is ");
        double len = input.nextDouble();
        System.out.print("Width is ");
        double wid = input.nextDouble();

        Rectangle area = new Rectangle();

        double areaOf = area.calculateArea(len, wid);
        double perimeterOf = area.calculatePerimeter(len, wid);

        System.out.printf("Area is: %.2f\n", areaOf);
        System.out.printf("Perimeter is: %.2f\n", perimeterOf);

        input.close();
    }

}