package files;

import java.io.*;

public class FileMerge2 {

	public static void main(String[] args)throws IOException {

		File f = new File("c:\\bhavani","bhavani.txt");
		File f1 = new File("c:\\bhavani","abc.txt");
		File f2 = new File("c:\\bhavani","xyz.txt");
		
		
		PrintWriter pw=new PrintWriter(f);
		BufferedReader br=new BufferedReader(new FileReader(f1));
		BufferedReader br1=new BufferedReader(new FileReader(f2));

		
		String line1=br.readLine();
		String line2=br1.readLine();

		
		while(line1!=null || line2!=null) {
			if(line1!=null) {
				pw.println(line1);
				line1=br.readLine();
			}
			if(line2!=null) {
				pw.println(line2);
				line2=br1.readLine();
			
		}
		
	}
		pw.flush();
		br1.close();
		br.close();
		pw.close();
		
	}	

}
