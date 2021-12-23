package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		hs.add("INDIA");
		System.out.println(hs);
		//System.out.println(hs.remove("Prajna"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		/*
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 */

	}

}
