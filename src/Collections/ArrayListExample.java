package Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Meghana");
		a.add("Kavya");
		a.add("Meghana");
		System.out.println(a);
		a.add(0, "Prajna");
		System.out.println(a);
		/*a.remove(1);
		a.remove("Kavya");
		System.out.println(a);*/
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("Meghana"));
		System.out.println(a.indexOf("Kavya"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
