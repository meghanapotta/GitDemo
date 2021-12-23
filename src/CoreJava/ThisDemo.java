package CoreJava;

public class ThisDemo {

	int a=2;
	
	public void getData() {
		
		int a = 3;
		System.out.println(a);
		//this refers to invoke current object - object scope lies in the class level
		System.out.println(this.a);
		//sum of local variable and global variable
		System.out.println(a + this.a);
	}
	
	public static void main(String[] args) {

		ThisDemo a = new ThisDemo();
		a.getData();
	}

}
