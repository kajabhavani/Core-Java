package javalang1;
import java.util.*;
import java.util.ArrayList;

public class Test {
	
	public String toString()
	{
		return "test";
	}

	public static void main(String[] args) {

		String s= new String("bhavani");
		System.out.println(s);
		Integer i1=new Integer(10);
		System.out.println(i1);
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		System.out.println(al);
		Test t=new Test();
		System.out.println(t);
		
		
	}

}
