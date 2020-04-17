package COLLECTIONS;

import java.util.*;
//import java.util.Comparator;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet<String> t=new TreeSet<String>(new MyComparatorString());
		
		t.add("veena");
		t.add("samhitha");
		t.add("ruthvik");
		t.add("poorvi");
		t.add("bhavani");
		System.out.println(t);
		
		
		
	}

}


