package COLLECTIONS;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet t1 = new TreeSet();
		t1.add("A");
		t1.add("a");
		t1.add("L");
		t1.add("B");
		t1.add("Z");
		
		//t1.add(new Integer(10));
		//t1.add(null);
		System.out.println(t1);
		
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("B"));
		System.out.println("Z".compareTo("Z"));
		System.out.println("Z".compareTo(null));
		
		
	}

}
