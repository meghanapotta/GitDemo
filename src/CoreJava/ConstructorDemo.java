package CoreJava;

public class ConstructorDemo {

	//Default
	public ConstructorDemo() {
		System.out.println("I am in the Constructor");
		System.out.println("costructor");
	}

	//Parameterized
	public ConstructorDemo(int a,int b) {
		System.out.println("I am in the Parameterized Constructor");
		int c = a+b;
		System.out.println(c);
	}
	
	public ConstructorDemo(String str) {
		System.out.println(str);
	}
	
	public void getData() {
		System.out.println("I am in the method");
	}

	public static void main(String[] args) {

		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo c = new ConstructorDemo(4,5);
		ConstructorDemo d = new ConstructorDemo("hello");
	}

}
