package exceptions;

public class Test {

	public static void main(String[] args) {

       doStuff();
       System.out.println(10/0);
	}
	public static void doStuff()
	{
		doMoreStuff();
		System.out.println("hi");
		
	}
	public static void doMoreStuff()
	{
		System.out.println("hello");
	}

}
