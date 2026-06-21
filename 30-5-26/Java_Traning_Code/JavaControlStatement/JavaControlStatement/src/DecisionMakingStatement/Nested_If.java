package DecisionMakingStatement;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String address = "USA";
		if(address.endsWith("India")) {
			if(address.contains("Meerut")){
				System.out.println("Your city is Meerut");
			}else if(address.contains("Noida")) {
				System.out.println("Your city is noida");
			}else {
				System.out.println(address.split(",")[1]);
			}
		}else {
			System.out.println("Your are living in india");
		}
		

	}

}
