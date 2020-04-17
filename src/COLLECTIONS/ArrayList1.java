package COLLECTIONS;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {

		List<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Advjava");
		al.add("Spring");
		al.add("oracle");
		al.add("java script");
		
		//System.out.println(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("**********");
		
		for(String s:al)
			System.out.println(s);
		
		System.out.println("**********");
		
		ListIterator<String> list1=al.listIterator(al.size());
		
		while(list1.hasPrevious())
		{
			System.out.println(list1.previous());
		}
		
		
	}

}
