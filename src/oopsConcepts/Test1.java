package oopsConcepts;

public class Test1 {

	public void m1(String s)
	{
		System.out.println("string version");
	}
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer version");
	}
	


public static void main(String[] args) {

Test1 t=new Test1();
t.m1("donepudi");
t.m1(new StringBuffer("bhavani"));
//t.m1(null);


}
}
