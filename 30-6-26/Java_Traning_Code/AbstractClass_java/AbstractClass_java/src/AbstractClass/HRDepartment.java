package AbstractClass;

public class HRDepartment extends IT_Department {
	public void dept() {
		System.out.println("Dept: Enginering");
	}
	
	public void salary() {
		System.out.println("Salary : This is the salary book");
	}
	
	public void bonus() {
		System.out.println("Bonus: This is bonus block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HRDepartment ob = new HRDepartment();
		ob.dept();
		ob.salary();
		ob.Setup();
		ob.support();
		ob.bonus();
		System.out.println("----------------");
		IT_Department m = new HRDepartment();
		m.dept();
		m.salary();
		m.Setup();
		m.support();

	}

}
