package Exceptions;

public class Unchecked_Exception {

	public static void main(String[] args) {
		System.out.println("Program started");
		// TODO Auto-generated method stub
		
		try {
			int x = 10/0;
			System.out.println(x);
		}catch(ArithmeticException e) {
			System.out.println("something went wrong" + e.getMessage());
			
			
		}
		System.out.println("Program end");

	}

}
