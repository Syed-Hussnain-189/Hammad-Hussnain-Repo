public class BankAccount {
    String name;
    double balance;

    //Deposit Function
    public void deposit(double amount){
        balance += amount;
    };

    //Withdraw Function
    public void withdraw(double amount){
        balance -= amount;
    };

    //Menu Bar
    public static void menu(){System.out.println("Press 1:To Deposit An Amount ");
        System.out.println("Press 2:To Withdraw An Amount ");
        System.out.println("Press 3:To View The Current Balance ");
        System.out.println("Press 4:To Exit ");}

    //Constructors
    BankAccount(String name , double balance){
        this.name=name;
        this.balance=balance;
    }
    BankAccount(){

    }
}
