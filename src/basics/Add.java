package basics;

import java.util.Scanner;


public class Add {

	public static void main(String[] args) {
      int a;
      int b;
      String name="bhavani";
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value for a");
     a=sc.nextInt();
     System.out.println("enter the value for b");
     b=sc.nextInt();
      
      System.out.println(a+b);
      System.out.println(name);
      System.out.println("value of course is:  "+name);
	}

}
