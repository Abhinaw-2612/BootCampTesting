package Exceptions;

public class CheckedException_ThrowsDeclarstion {
	int x = 143/0;
	
	public void m1() {
		System.out.println(x);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CheckedException_ThrowsDeclarstion b = new CheckedException_ThrowsDeclarstion();
		b.m1();
		Thread.sleep(1000);

	}

}
