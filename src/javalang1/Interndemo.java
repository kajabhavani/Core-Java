package javalang1;

public class Interndemo {

	public static void main(String[] args) {
		/*String s1=new String("bhavani");
		String s2=s1.intern();
		System.out.println(s2);
		System.out.println(s1==s2);
		String s3="bhavani";
		System.out.println(s3==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());*/
		
		String  s1=new String("bhavani");
		String s2=s1.concat("software");
		String s3=s2.intern();
		System.out.println(s2==s3);
		String s4="bhavanioftware";
		System.out.println(s3==s4);
		
	}

}
