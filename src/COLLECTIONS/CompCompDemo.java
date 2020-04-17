package COLLECTIONS;

import java.util.TreeSet;
import java.util.Comparator;

public class CompCompDemo {

	public static void main(String[] args) {

		Employee e1=new Employee("kalyani",10);
		Employee e2=new Employee("veda",50);
		Employee e3=new Employee("bhavani",34);
		Employee e4=new Employee("samhitha",80);
		Employee e5=new Employee("dhanam",20);
		TreeSet<Employee> t1=new TreeSet<Employee>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
		
		TreeSet<Employee> t2=new TreeSet<Employee>(new MyComparatorEmpObj());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);
		
		
		}

}
class MyComparatorEmpObj implements Comparator<Employee>{
	
		@Override
	public int compare(Employee emp1, Employee emp2) {
		String s1=emp1.name;
		String s2=emp2.name;
		return s1.compareTo(s2);
	}
	
}
