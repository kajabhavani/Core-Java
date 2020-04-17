package exceptions;

public class Teat1 {

	public static void main(String[] args) {

		System.out.println("statement1");
		try{
		System.out.println(10/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
          e.printStackTrace();
       // System.out.println(e.getMessage());
         //System.out.println(e.toString());
         
		}
		System.out.println("hi");
	}

}
