package COLLECTIONS;
import java.util.*;
public class WeakHashMap {

	public static void main(String[] args) throws Exception {
   HashMap h=new HashMap();
   Temp t=new Temp();
   h.put(t,"durga");
   System.out.println(h);
   t=null;
   System.gc();
   Thread.sleep(1000);
   System.out.println(h);
	}

}
class Temp{
	public String toString()
	{
	return "temp";
	}
	public void finalize()
	{
		System.out.println("finalize method");
	}
	
}
