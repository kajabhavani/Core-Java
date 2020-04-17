package COLLECTIONS;
import java.util.*;
public class TreeSetDemo5 {

	public static void main(String[] args) {

		TreeSet<Object> t1=new TreeSet<Object>(new MyComparatorHetero());
		t1.add("XYZ");
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("ABC"));
		t1.add("AA");
		t1.add("ABCD");
		t1.add("AA");
		t1.add("XY");
		System.out.println(t1);
	}

}
class MyComparatorHetero implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		int l1=s1.length();
		int l2=s2.length();
		if(l1<l2)
			return -1;
		else if(l1>l2)
			 return 1;
		else 
			return s1.compareTo(s2);
	}
}
