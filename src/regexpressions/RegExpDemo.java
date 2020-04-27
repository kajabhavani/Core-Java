package regexpressions;
import java.util.regex.*;

public class RegExpDemo {

	public static void main(String[] args) {

		  int count=0;
		  Pattern p=Pattern.compile("a?");
		  Matcher m = p.matcher("KajaaaaBhavaan1");
		  while(m.find())
		  {
			   count++;
			  System.out.println(m.start()+"===="+m.end()+"====="+m.group());
		  }
		  System.out.println("No. of occurances::: "+count);
	}

}
