package Abstract;

public abstract class CreditPayment implements Payment {

    double balance = 10000;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount credited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Amount debited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public abstract void interest();
}