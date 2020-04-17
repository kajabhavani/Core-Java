package files;
import java.io.*;

public class fileDemo {

	public static void main(String[] args) {
		
      int count=0;
      File f = new File("c://bhavani");
      String[] s=f.list();
      for(String s1:s)
      {
    	  count++;
    	  System.out.println(s1);
      }
      System.out.println("The Total Number of Files::::"+count);
	}

}
