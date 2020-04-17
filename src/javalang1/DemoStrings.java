package javalang1;

public class DemoStrings {

	public static void main(String[] args) {

		/*String s=new String("durga");
		String s2=s.concat("durga");
		String s3="durga";
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s==s2);
		System.out.println(s.equals(s3));
		
		/*StringBuffer s1=new StringBuffer("bhavani");
		 StringBuffer s3=s1.append("bhavani");
		 System.out.println(s1==s3);
		 System.out.println(s1.equals(s3));*/
		
		/* String s1=new String("bhavani");
		 s1.concat("software");
		 String s2=s1.concat("solutions");
		 s1=s1.concat("soft");
		 System.out.println(s1);
		 System.out.println(s2);*/
		 
		String s1=new String("bhavani");
		String s2=new String("bhavani");
		StringBuffer sb1=new StringBuffer("bhavani");
		StringBuffer sb2=new StringBuffer("bhavani");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		//System.out.println(s1==sb2);
		System.out.println(s1.equals(sb1));
		
		
		
		
		
	

}
}
