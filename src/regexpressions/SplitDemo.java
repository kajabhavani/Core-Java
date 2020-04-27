package regexpressions;
import java.util.regex.*;

public class SplitDemo {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\.");
		String[] s=p.split("www.bhavanisoftware.com");
		for(String s1:s)
		{
			System.out.println(s1);
		}

	}

}
