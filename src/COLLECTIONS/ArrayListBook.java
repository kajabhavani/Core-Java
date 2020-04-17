package COLLECTIONS;

import java.util.*;

public class ArrayListBook {

	public static void main(String[] args) {

		List<Book> l1=new ArrayList<Book>();
		
		Book b1=new Book(1,"java","sunmicro",100);
		Book b2=new Book(2,"abcs","bhavani",200);
		Book b3=new Book(3,"xyz","dileep",10);
		
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		
		Iterator<Book> i1=l1.iterator();
		while(i1.hasNext()){
			Book b=i1.next();
			System.out.println(b.bookid+"  "+b.name+"  "+b.author+"  "+b.quantity);
		}
		
		
	}

}
