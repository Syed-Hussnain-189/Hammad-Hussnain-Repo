import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {

        System.out.println("Press 1: To Deposit an amount");
        System.out.println("Press 2: To Withdraw an amount");
        System.out.println("To View the current balance");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter choice: ");
        int choice = input.nextInt();

        BankAccount bank = new BankAccount(500);

        if(choice == 1){
            System.out.print("Enter the amount you want to deposit in your account > ");
            double amount = input.nextDouble();
            bank.deposit(amount);
        }else if(choice == 2){
            System.out.print("Enter the amount you want to withdraw from your account > ");
            double amount = input.nextDouble();
            bank.withdraw(amount);
        }else if(choice == 3) {
            System.out.println(bank.balance);
        }else {
            System.out.println("Wrong choice entered");
        }

        input.close();
    }
}
