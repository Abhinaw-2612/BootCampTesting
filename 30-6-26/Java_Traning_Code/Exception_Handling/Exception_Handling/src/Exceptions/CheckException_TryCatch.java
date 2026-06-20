package Exceptions;

public class CheckException_TryCatch {
	int x = 10/0;
	
	public void m1() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckException_TryCatch t = new CheckException_TryCatch();
		t.m1();
		
		try {
				Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
