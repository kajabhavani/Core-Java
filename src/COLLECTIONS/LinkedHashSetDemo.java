package COLLECTIONS;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet l1=new LinkedHashSet();
		
		l1.add("B");
		l1.add("H");
		l1.add("A");
		l1.add("V");
		l1.add("N");
		l1.add(null);
		l1.add(10);
		System.out.println(l1.add("H"));
		System.out.println(l1);
		
		
		
	}

}
