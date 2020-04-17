package COLLECTIONS;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {

		List<Object> l1=new ArrayList<Object>();
		l1.add("bhavani");
		l1.add(100);
		l1.add(500);
		l1.add("donepudi");
		l1.add("dileep");
		l1.add(19.56);
		l1.add("bhavani");
		
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		Iterator<Object> i1=l1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		List<Object> l2=new ArrayList<Object>();
		l2.add(12.4);
		l2.add("java");
		l2.add(50);
		l2.add("advjava");
		l2.addAll(l1);
		
		
		
		System.out.println(l2);
		System.out.println(l2.size());
		
		//l2.remove("java");
		
		//System.out.println(l2);
		
		//l2.removeAll(l1);
		//System.out.println(l2);
		//System.out.println(l1);
		
		//l2.retainAll(l1);
		//System.out.println(l2);
		
		
		//System.out.println(l1.contains("bhavani");
		
		System.out.println(l1.isEmpty());
		
		
		
		
		
	}

}
