package COLLECTIONS;
import java.util.*;
public class TreeSetDemo4 {

	public static void main(String[] args) {

		TreeSet<Object> t=new TreeSet<Object>(new MyComparator());
		t.add(new StringBuffer("tej"));
		t.add(new StringBuffer("ram"));
		t.add(new StringBuffer("dev"));
		t.add(new StringBuffer("pan"));
		t.add(new StringBuffer("lak"));
		System.out.println(t);
	}

}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj1.toString();
		return s1.compareTo(s2);
		
	}
}
