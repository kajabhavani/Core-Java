package files;
import java.io.*;

public class FileMerger {

	public static void main(String[] args)throws IOException {

		File f = new File("c:\\bhavani","bhavani.txt");
		File f1 = new File("c:\\bhavani","abc.txt");
		File f2 = new File("c:\\bhavani","xyz.txt");
		
		
		PrintWriter pw=new PrintWriter(f);
		BufferedReader br=new BufferedReader(new FileReader(f1));
		String line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		BufferedReader br1=new BufferedReader(new FileReader(f2));
		String line1=br1.readLine();
		while(line1!=null) {
			pw.println(line1);
			line1=br1.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		
	}

}
