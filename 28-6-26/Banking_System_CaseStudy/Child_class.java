package Inheritance;

public class Child_class extends Base_class {

    public void minimumBalance(int amt, int balance) {
        int minimumBalance = amt - balance;
        System.out.println("Your minimum balance is " + minimumBalance);
    }

    public static void main(String[] args) {

        Child_class c = new Child_class();
        c.minimumBalance(12345, 5000);

        Base_class b = new Base_class();
        b.display();   
    }
}