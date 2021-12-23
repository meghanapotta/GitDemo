package Collections;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		
		//print unique numbers in an array using collections
		int a[] = {2,3,4,4,2,4,4,5,7,9,3,7,9};

		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			
			int k=0;
			if(!al.contains(a[i])) {
				
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i] == a[j]) {
					
						k++;
					}
				}
				//System.out.println(a[i]+"->"+k);
				if(k == 1) {
					
					System.out.println(a[i]+" is a unique number");
				}
			}
		}
	}
}
