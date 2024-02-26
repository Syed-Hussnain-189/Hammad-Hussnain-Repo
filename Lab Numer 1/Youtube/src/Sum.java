import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        //object Of Scaner Class
        Scanner sc = new Scanner(System.in);

        //Taking Input o f Numbers
        System.out.println("Enter The 1st Number");
        double num_1 = sc.nextDouble();
        System.out.println("Enter The 2nd Number");
        double num_2 = sc.nextDouble();

        //Printing the Sumation
        System.out.println("The Sum Of Number Is " + (num_1+num_2));
    }
}
