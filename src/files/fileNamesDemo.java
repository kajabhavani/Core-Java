package files;
import java.io.*;

public class fileNamesDemo {

	public static void main(String[] args) {
		int count=0;
		File f=new File("c:/Users/Donepudi/GDE/Technical");
		String[] s=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			if(f1.isFile())
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("the total number of files::::"+count);
		

	}

}
