package CoreJava;

public class ChildDemo extends ParentDemo {

	String name = "QAAutomation";
	
	public ChildDemo() {
		
		super();
		System.out.println("Child class constructor");
	}
	
	public void getStringData() {
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
	
	public void getData() {
		
		super.getData();
		System.out.println("I am child class");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
