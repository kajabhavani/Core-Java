package javalang1;

public class DemoOnClone implements Cloneable {
	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		DemoOnClone d1=new DemoOnClone();
		DemoOnClone d2=(DemoOnClone)d1.clone();
		
		d2.i=222;
		d2.j=333;
		System.out.println(d2.i+"===="+d2.j);
		System.out.println(d1.i+"===="+d1.j);
		
	

		
		
		
	}

}
