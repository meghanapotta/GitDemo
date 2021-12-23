package CoreJava;

public class ExceptionDemo {

	public static void main(String[] args) {

		int b=7,c=0;
		try {
			
			int k=b/c;
			//int a[] = new int[5];
			//System.out.println(a[7]);
			
		}
		/*catch(ArithmeticException et) {
			
			System.out.println("I catch the Arithmetic exception");
			
		}
		catch(IndexOutOfBoundsException ets) {
			
			System.out.println("I catch the IndexBound exception");
			
		}
		catch(Exception e) {
			
			System.out.println("I catch the error/exception");
			
		}*/
		finally{
			
			// this block will be executed irrespective of exception thrown or not
			System.out.println("delete cookies");
			
		}
	}
}
