package COLLECTIONS;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {

    LinkedList<String> l1=new LinkedList<String>();
    l1.add("bhavani");
    l1.add("dileep");
    l1.add("donepudi");
    l1.add("omaha");
    l1.add("bhavani");
    l1.add("kalyani");

    System.out.println(l1);
     Iterator<String> i1= l1.iterator();
     
     while(i1.hasNext())
     {
    	 System.out.println(i1.next());
     }
     
     l1.addFirst("golvepalli");
     System.out.println(l1);
     
     l1.addLast("katuru");
     System.out.println(l1);
     
     l1.add("veda");
     l1.add("samhitha");
     System.out.println(l1);
     
     l1.add(1, "chakri");
     
     System.out.println(l1);
     
    
	}

}
