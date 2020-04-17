package COLLECTIONS;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
     
		HashMap<Object,Object> h1=new HashMap<Object,Object>();
		h1.put("chiranjeevi",700);
		h1.put("balayya",800);
		h1.put("venkatesh",200);
		h1.put("nagarjuna",500);
		System.out.println(h1);
		System.out.println(h1.put("chiranjeevi", 1000));
		Set s=h1.keySet();
		System.out.println(s);
		Collection c=h1.values();
		System.out.println(c);
		Set s1=h1.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
		Map.Entry<Object,Object> m1=(Map.Entry<Object, Object>)itr.next();
		System.out.println(m1.getKey()+"------"+m1.getValue());
		
		if(m1.getKey().equals("nagarjuna")){
			m1.setValue(100000);
		}
		}
		System.out.println(h1);
	}

}
