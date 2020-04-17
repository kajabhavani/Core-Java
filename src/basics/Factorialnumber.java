package basics;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for n:  ");
		int n=sc.nextInt();
		int fact=1,i;
		while(n>0)
		{
			fact=fact*n;
			n=n-1;
			
			
		}
		System.out.println("the given number factorial value is: "+fact);
		
		/*int x=5;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial value using for loop: "+fact);*/

	}

}
