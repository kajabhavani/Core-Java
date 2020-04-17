package wrapperclass;

public class boxUnbox {
	
	public static void main(String[] args){
		

	int a=10;
	long l=200;
	float f=19.45f;
	double d=134.7834345;
	char c='x';
	

	System.out.println("integer boxing n unboxing");
	Integer I1= a;  //auto-boxing;
	//Integer I1=new Integer(a);//boxing
	Integer I5=Integer.valueOf(a);
	System.out.println(I1);
    Integer I2=new Integer(20);
    Integer I3=new Integer("20");
    
	
	// int b=I2;   //auto un-boxing
	 int b=I2.intValue();  //un-boxing
	 System.out.println(I2);   
	 
	 System.out.println("long boxing n unboxing");
	 Long L1=l;
	 System.out.println(L1);
	 
	 Long l2=new Long(100);
	 long l3=l2;
	 System.out.println(l3);
	 
	 System.out.println("float boxing n unboxing");
	 Float f1=f;
	 System.out.println(f1);
	 
	 Float f2=new Float(18.45f);
	 float f3=f2;
	 System.out.println(f3);
	 
	 System.out.println("double boxing n unboxing");
	 Double d1=d;
	 System.out.println(d1);
	 
	 Double d2=new Double(12.656868);
	 double d3=d2;
	 
	 System.out.println(d3);
	 
	 System.out.println("char boxing n unboxing");
	 Character c1=c;
	 System.out.println(c1);
	 
	 Character c2=new Character('a');
	 char c3=c2;
	 System.out.println(c3);

	 
	 
	 
	 
	

	
	
	 
	
	}	
}
