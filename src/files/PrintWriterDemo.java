package files;
import java.io.*;

public class PrintWriterDemo {
	public static void main(String[] args)throws IOException
	{
		File f = new File("c:\\bhavani","xyz.txt");
		//FileWriter fw=new FileWriter(f);
		PrintWriter pw=new PrintWriter(f);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('t');
		pw.println("bhavani");
		pw.flush();
		pw.close();
		
		
		
		
	}
	

}
