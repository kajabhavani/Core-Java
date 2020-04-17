package javalang1;

public class DemoStrings1 {

	public static void main(String[] args) {

		
		
Integer I=new Integer(10);
		StringBuffer sb3=new StringBuffer("abcdefgh");
		sb3.insert(3,"bhavani");
		System.out.println(sb3);;
		
		System.out.println(sb3.delete(2,6));
		System.out.println(sb3.deleteCharAt(6));
		System.out.println(sb3.reverse());
		
		sb3.setLength(8);
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		sb3.ensureCapacity(1000);
		System.out.println(sb3.capacity());
		
		StringBuffer sb4=new StringBuffer(1000);
		sb4.append("bhavani");
		sb4.trimToSize();
		System.out.println(sb4.capacity());
		
		sb4.append("donepudi").append("dileep").append("chakri").insert(10, "varhi").reverse();
		System.out.println(sb4);
		
		Boolean B=new Boolean("yes");
		Boolean B1=new Boolean("True");
		System.out.println(B);
		Boolean B2=new Boolean("bhavani");
		System.out.println(B2);
		
		System.out.println(B.equals(B1));
		
		
		
		
		
		/*StringBuffer sb=new StringBuffer();
		sb.append("PI value is:");
		sb.append(3.14);
		sb.append("it is exactly is:");
		sb.append(true);
		System.out.println(sb);
		
		
		
		
		System.out.println(sb.capacity());
		sb.append("dileep chakravarthi donepudi");
		System.out.println(sb.capacity());
		StringBuffer sb1=new StringBuffer("bhavani");
		System.out.println(sb1.capacity());
		
		
		
		String s="bhavani";
		System.out.println(s.length());
		
		String s1=s.toUpperCase();
		String s2=s.toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		String s4=s2.toLowerCase();
		System.out.println(s4);
		String s5=s4.toUpperCase();
		System.out.println(s5);*/
		
	}

}
