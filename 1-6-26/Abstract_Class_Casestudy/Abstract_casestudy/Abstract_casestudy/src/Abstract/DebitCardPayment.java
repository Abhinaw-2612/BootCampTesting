package Abstract;

public class DebitCardPayment extends CreditPayment {

    @Override
    public void interest() {
        System.out.println("Interest has been applied to the debit card account");
    }

    public void minimumBalance() {
        System.out.println("Minimum balance is low. Please maintain the required balance");
    }

    public static void main(String[] args) {

        
        DebitCardPayment ob = new DebitCardPayment();
        ob.deposit(2000);
        ob.withdraw(500);
        ob.interest();
        ob.minimumBalance();

       
        CreditPayment c = new DebitCardPayment();
        c.deposit(1000);
        c.withdraw(300);
        c.interest();
    }
}
