package list;
import java.util.*;

public class C_02_ArrayList_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList <String> ob = new ArrayList<String>();
			ob.add("h");
			ob.add("l");
			ob.add("o");
			ob.add("f");
			ob.add("g");
			
			int  ListSize = ob.size();
			int count = 0;
			
			for(int i = 0; i<ListSize; i++) {
				System.out.println("the size is" +ob.get(i));
				count += 1;
				
				
			}
			System.out.println(count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
