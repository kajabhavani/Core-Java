package files;
import java.io.*;

public class BufferedReaderDemo {
	public static void main(String[] args)throws IOException {
		
		File f = new File("c:\\bhavani","xyz.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		/*intchar[] ch=new char[(int)f.length()];
		br.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}
	 i=br.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = br.read();
		}*/
		
		
		
	}

}
