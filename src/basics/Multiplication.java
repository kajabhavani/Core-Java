package basics;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for n: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		 {
			 System.out.println(n+"*"+i+"="+(n*i));
			 
		 }
		
		
	}

}
