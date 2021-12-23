package CoreJava;

public class Pb1 {

	public static void main(String[] args) {

		for(int i=1;i<=4;i++) {
			
			System.out.println("outer loop started");
			System.out.println("Outer");
			for(int j=1;j<=4;j++) {
				System.out.println("inner loop started");
				System.out.println("inner");
			}
			System.out.println("outer loop finished");
			System.out.println("Output finished");
		}
		System.out.println("Program is fully executed");
	}

}
