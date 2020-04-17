package javalang1;
import java.lang.reflect.*;

public class infoClass {

	public static void main(String[] args){
	int count=0;
	Object o=new String("bhavani");
	Class c=o.getClass();
	System.out.println("fully qualified name of class:"+c.getName());
	Method[] m=c.getDeclaredMethods();
	System.out.println("methods info");
	for(Method m1:m)
	{
	count++;
	System.out.println(m1.getName());
	}
	System.out.println("the number of methods"+count);
	}

}
