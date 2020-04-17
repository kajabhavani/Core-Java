package javalang1;

public class wrapperClass {

	public static void main(String[] args) {

		String c1=Integer.toBinaryString(10);
		System.out.println(c1);
		String c2=Integer.toOctalString(10);
		System.out.println(c2);
		String c3=Integer.toHexString(10);
		System.out.println(c3);
		Boolean B1=new Boolean("yes");
		Boolean B2=new Boolean("true");
		System.out.println(B1);
		System.out.println(B2);
		System.out.println(B1.equals(B2));
		
		Integer I=new Integer(20);
		String s=I.toString();
		System.out.println(s);
		int i1=I.intValue();
		System.out.println("value of i1 is::"+i1);
		//Long l=new Long(12.7l);
		System.out.println(I.byteValue());
		System.out.println(I.shortValue());
		System.out.println(I.longValue());
		System.out.println(I.floatValue());
		System.out.println(I.doubleValue());
		
		Character ch=new Character('a');
		char c=ch.charValue();
		System.out.println(c);
		
		Boolean B= Boolean.valueOf("bhavani");
		System.out.println(B);
		boolean b=B.booleanValue();
		System.out.println(b);
		
		int a=Integer.parseInt("10");
		System.out.println(a);
		
		
		
		/*System.out.println(I);
		Integer i=Integer.valueOf(10);
		Integer i1=Integer.valueOf("1111",37);
		
		
		System.out.println(i);
		System.out.println(i1);*/
		
		
		
	}

}
