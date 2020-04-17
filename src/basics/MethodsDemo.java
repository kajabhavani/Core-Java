package basics;

public class MethodsDemo {

	static double multiplytwonumbers(int num1,double num2)
	{
		System.out.println("input received to multiply two numbers are"+num1+"and"+num2);
		double result=num1*num2;
		return result;
	}
	public static void main(String[] args) {
	
		System.out.println("starting of main method");
		double r1=multiplytwonumbers(12,2.6);
		System.out.println("value of r1 is"+r1);
		
		displayDetails(1,"bhavani","java",1000);
		//System.out.println();
		System.out.println("ending of main method");

	}
	
	static void displayDetails(int id,String name,String course,int fee)
	{
		System.out.println("value of id is"+id);
		System.out.println("value of name is"+name);
		System.out.println("vaue of course is"+course);
		System.out.println("vaue of fee is"+fee);
	}

}
