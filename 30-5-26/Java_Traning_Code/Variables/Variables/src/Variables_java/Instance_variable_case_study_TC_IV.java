package Variables_java;

public class Instance_variable_case_study_TC_IV {
	
	
	public int accountNumber;
	public String accountHolderName;
	public int balance;
	public String branchName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_variable_case_study_TC_IV a = new Instance_variable_case_study_TC_IV();
		
		a.accountHolderName = "SitaRaman";
		a.accountNumber = 11002233;
		a.balance = 45000000;
		a.branchName = "Coforge Ltd. HDFC";
		
		
		System.out.println(a.accountHolderName);
		System.out.println(a.accountNumber);
		System.out.println(a.balance);
		System.out.println(a.branchName);
		
		
		
		

	}

}
