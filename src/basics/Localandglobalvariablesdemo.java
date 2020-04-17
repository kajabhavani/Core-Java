package basics;

public class Localandglobalvariablesdemo {

	static String course="java";
	
	public static void main(String[] args) {

		m1();
		m2();
	}
  static  void m1()
   {
	   int marks=900;
	   System.out.println("value of marks is: "+marks);
   }
   static void m2()
   {
	   
	   //System.out.println("value of marks is"+marks);
	   System.out.println("\n value of course is: "+course);

   }
}
