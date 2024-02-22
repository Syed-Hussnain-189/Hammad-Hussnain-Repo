public class BankAccount {

    double balance;
    BankAccount(double bal){
        balance = bal;
    }

    String name;
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }
}