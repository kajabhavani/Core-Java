package files;
import java.io.*;

public class BuferedWriterDemo {

	public static void main(String[] args)throws IOException {
 
		File f=new File("c:\\bhavani","abc.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("bhavani");
		bw.newLine();
		bw.write("software solutions");
		bw.flush();
		bw.close();
		
		
		
		
	}

}
