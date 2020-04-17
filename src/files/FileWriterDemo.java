package files;
import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args)throws IOException {

		File f1=new File("c:\\bhavani","xyz.txt");
		FileWriter fw = new FileWriter(f1,true);
		fw.write(98);
		fw.write("havani\nsoftwaresolutions");
		fw.write('\n');
		char[] ch={'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader(f1);
	
		
		
		
	}

}
