package COLLECTIONS;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList l1=new LinkedList();
		l1.add("balakrishna");
		l1.add("chiru");
		l1.add("venky");
		l1.add("nag");
		l1.add("krishna");
		System.out.println(l1);
		ListIterator itr=l1.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("venky"))
			{
				itr.remove();
			}else if(s.equals("nag"))
			{
				itr.add("chaitu");
			}else if(s.equals("chiru"))
			{
				itr.set("charan");
			}
					
		}
		System.out.println(l1);
		
	}

}
