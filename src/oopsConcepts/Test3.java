package oopsConcepts;

public class Test3 {
	public void m1(int i,float f)
	{
		System.out.println("int-float version");
	}
	public void m1(float f,int i)
	{
		System.out.println("float-int version");
	}
	


public static void main(String[] args) {

Test3 t=new Test3();
t.m1(10,10.5f);
t.m1(10.5f,12);
//t.m1(10,10);
//t.m1(10.5f,10.5f);

}
}
