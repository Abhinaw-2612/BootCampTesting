package list;
import java.util.*;
public class C_01_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> ob = new ArrayList<String>();
		ob.add("h");
		ob.add("l");
		ob.add("o");
		ob.add("f");
		String output = ob.get(2);
		System.out.println(output);
		ArrayList <String> om = new ArrayList<String>();
		ob.add("h");
		ob.add("l");
		ob.add("o");
		ob.add("f");
		ob.add("g");
		
		System.out.println("All the list"+ob);
		ob.add("g");
		System.out.println("All the list"+ob);
		ob.add(1, "m");
		System.out.println("All the list"+ob);
		if(ob.equals(om)) {
			System.out.println("it is equal");
			
			
		}else {
			System.out.println("Not equal");
			
		}
		
	
		
		
		

	}

}
