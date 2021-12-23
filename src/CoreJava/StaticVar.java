package CoreJava;

public class StaticVar {
	
	String name; // instance variable
	String address;
	static String city; // class variables
	static int i;
	
	static {
		
		city = "Bangalore";
		i=0;
	}
	
	StaticVar(String name,String address){
		
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress() {
		
		System.out.println(address+" "+city);
		
	}

	public static void getCity() {
		
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Kavya","RingRoad");
		StaticVar obj1 = new StaticVar("Maggie","PottaVariStreet");
		StaticVar obj2 = new StaticVar("Maggie","PottaVariStreet");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i=4;
		StaticVar.city="XYZ";
		
	}
}
