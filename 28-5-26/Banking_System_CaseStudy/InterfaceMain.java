package Interface;

interface CreditPayment {
    void creditPayment(double amt);
}

interface DebitCardPayment {
    void debitCardPayment(double amt);
}

class BankingSystem implements CreditPayment, DebitCardPayment {

    double bal = 10000; 

    public void creditPayment(double amt) {
        bal = bal + amt;   // ✅ credit logic
        System.out.println("Amount credited: " + amt);
        System.out.println("Updated balance: " + bal);
    }

    public void debitCardPayment(double amount) {
        bal = bal - amount;   
        System.out.println("Amount debited: " + amount);
        System.out.println("Updated balance: " + bal);
    }
}

public class InterfaceMain {

    public static void main(String[] args) {

        BankingSystem b = new BankingSystem();

        b.creditPayment(2000); 
        b.debitCardPayment(1500); 
    }
}