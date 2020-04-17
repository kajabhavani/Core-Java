package COLLECTIONS;
import java.util.*;
public class TreeMapDemo3 {

	public static void main(String[] args) {

		TreeMap m=new TreeMap();
		m.put(100,"ZZZ");
		m.put(103,"YYY");
		m.put(101,"XXX");
		m.put(104,106);
		//m.put("AAA",106);  //classcastexception
		//m.put(null,106);  //nullpointerexception
		
		
		System.out.println(m);
		
	}

}
