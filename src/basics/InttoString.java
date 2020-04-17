package basics;

public class InttoString {

	public static void main(String[] args) {

		int i=10;
		String s=String.valueOf(i);
		System.out.println(i);
		System.out.println(s);
		
		System.out.println(i+10);
		System.out.println(s+10);
		
		int j=100;
		String a=Integer.toString(j);
		System.out.println(j);
		System.out.println(a);
		
		System.out.println(j+100);
		System.out.println(a+100);
		
		int x=300;
		String v=String.format("%d", x);
		System.out.println(x);
		System.out.println(v);
		
		System.out.println(x+100);
		System.out.println(v+100);
		
		
	}

}
