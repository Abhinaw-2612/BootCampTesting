package Variables_java;

public class Instance_variable {
	
	
	public int rollNum;
	public String Name;
	public int phoneNumber;
	public int totalMarks;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance_variable o = new Instance_variable();
		o.rollNum = 2205;
		o.Name = "Devansh";
		o.phoneNumber = 69694949;
		o.totalMarks =  300;
		
		
		System.out.println(o.rollNum);
		System.out.println(o.Name);
		System.out.println(o.phoneNumber);
		System.out.println(o.totalMarks);
		

	}
	
	

}
