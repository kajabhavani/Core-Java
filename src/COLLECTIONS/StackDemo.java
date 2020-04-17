package COLLECTIONS;

import java.util.*;


public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push("B");
		s.push("H");
		s.push("A");
		s.push("V");
		s.push("N");
		System.out.println(s);
		System.out.println(s.search("N"));
		System.out.println(s.search("M"));
		
		
		

		
	}

}
