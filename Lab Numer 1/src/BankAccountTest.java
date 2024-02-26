import java.util.Scanner;
public class BankAccountTest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        //Making Object
        BankAccount client1 = new BankAccount();

        //Taking Input Of Name
        System.out.println("Enter Your Name ");
        client1.name=s1.nextLine();

        //Taking Inpt Of Balance
        System.out.println("Enter the Balance ");
        client1.balance=s1.nextInt();

        BankAccount.menu();

        //Taking Input oF Choice
        int choice;
        System.out.println("Enter Your Choice");
        choice = s1.nextInt();

        //Cases
        double depositam;
        double withdrawam;
        do{
        if(choice == 1){
            System.out.println("Enter The Amount You Want To Deposit");
            depositam= s1.nextDouble();
            client1.deposit(depositam);
            choice = s1.nextInt();
        }else if(choice == 2){
            System.out.println("Enter The Amount You Want To Withdraw");
            withdrawam = s1.nextDouble();
            client1.withdraw(withdrawam);
            choice = s1.nextInt();
        }else if (choice == 3){
            System.out.println("Name is " + client1.name);
            System.out.println("Current Balance is " + client1.balance);
            choice = s1.nextInt();
        }else {
            System.out.println("Thanks For Using Our Service");
            break;
        }
        }while(true);

    }
}
