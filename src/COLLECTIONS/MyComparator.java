package COLLECTIONS;

import java.util.Comparator;


	class MyComparatorString implements Comparator{
		 public int compare(Object obj1,Object obj2){
			 String s1=(String)obj1;
			 String s2=obj2.toString();
			 return s2.compareTo(s1);
			 
		 }
	}


