package COLLECTIONS;
import java.util.*;

public class WeakHashMapDemo {

	public static void main(String[] args) throws Exception {
		
  {
		   WeakHashMap h1=new WeakHashMap();
		   Temp t1=new Temp();
		   h1.put(t1,"durga");
		  // h.put(t,"durga");
		   System.out.println(h1);
		   t1=null;
		   System.gc();
		   Thread.sleep(1000);
		   System.out.println(h1);
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
	}


