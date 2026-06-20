package list;
import java.util.*;

public class C_03_ArrayList_EnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList <String> ob = new ArrayList<String>();
			ob.add("h");
			ob.add("l");
			ob.add("o");
			ob.add("f");
			ob.add("g");
			
			
			int count = 0;
			
			for(String v:ob) {
				System.out.println("the size is" +v);
				count += 1;
				
				
			}
			System.out.println(count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
