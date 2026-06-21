package Exceptions;

public class UncheckedException_TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 10/3;
			System.out.println("Deivison result" +x);
		}catch(ArithmeticException e) {
			System.out.println("something went wrong" + e.getMessage());
		}finally {
			System.out.println("This is finally block");
		}

	}

}
