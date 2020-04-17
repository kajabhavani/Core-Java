package COLLECTIONS;

import java.util.*;

public class ArrayListsetnget {

	public static void main(String[] args) {

		ArrayList<Object> a1=new ArrayList<Object>();
		
		a1.add("omaha");
		a1.add("chicago");
		a1.add("lincoln");
		
		System.out.println("before update: "+a1.get(1));
		
		//updating an element at specific position
		a1.set(0, "Iowa");
		System.out.println("afetr updating: "+a1.get(1));
		
		System.out.println(a1);
		
		
		
	}

}
