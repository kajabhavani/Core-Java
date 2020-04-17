package oopsConcepts;

public class Test4 {
	public void m1(int i)
	{
		System.out.println("general method");
	}
	public void m1(int...x)
	{
		System.out.println("var-args method");
	}
	
public static void main(String[] args) {

Test4 t=new Test4();
t.m1();
t.m1(10,20);
t.m1(10);

}
}
