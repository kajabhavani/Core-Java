package basics;

public class Stringtolong {

	public static void main(String[] args) {

		String s="9640233233";
		long l=Long.parseLong(s);
		System.out.println(s);
		System.out.println(l);
		System.out.println(s+100);
		System.out.println(l+100);
		
		//code for long to string
		
		long j=234446565L;
		String a=String.valueOf(j);
		System.out.println(j);
		System.out.println(a);
		
		System.out.println(j+100);
		System.out.println(a+100);
		
		String value=Long.toString(j);
		System.out.println(j);
		System.out.println(value);
		
		System.out.println(j+100);
		System.out.println(value+100);
		
		
	}

}
