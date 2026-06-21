package AbstractClass;

public abstract class IT_Department implements Employee {
	public abstract void dept();
	public abstract void salary();
	
	public void Setup() {
		System.out.println("Setup: Dell Desktop setup");
	}
	public void support() {
		System.out.println("Support: ReliSource IT, HelpDesk");
	}

}
