package Bank_account;


class Account{
	String accountHolder;
	double balance;
	
	void deposit(double Amount) {
		balance += Amount;
	}
	
	void withdraw(double Amount) {
		balance -= Amount;
	}
	
	void interest(double ratePercent) {
		double interestAmount = balance * (ratePercent / 100);
        balance += interestAmount;
        System.out.println("Interest added: " + interestAmount);
       
	}
	
	void displayAccount() {
		System.out.println(balance);	}
}

public class BankAccount {
	
	
	

	public static void main(String[] args) {
		
		
		Account b = new Account();
		b.accountHolder = "Devansh";
		b.balance = 25555;
		b.deposit(50000000);
		b.deposit(34000000);
		b.interest(1);
		b.displayAccount();
		
		

	}

}
