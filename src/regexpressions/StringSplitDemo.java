package regexpressions;

import java.util.regex.Pattern;

public class StringSplitDemo {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\.");
		String s="Bhavani Software solutions";
		String[] s1=s.split("\\s");
		for(String s2:s1)
		{
			System.out.println(s2);
		}
	}

}
