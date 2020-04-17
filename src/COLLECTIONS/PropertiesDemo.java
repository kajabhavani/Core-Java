package COLLECTIONS;

import java.util.*;
import java.io.*;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		PropertiesDemo p = new PropertiesDemo();

		Properties pr = p.readFileFromClasspath("abc.properties");
		System.out.println(pr);

		String s = pr.getProperty("scott");
		System.out.println(s);
		// pr.setProperty("nag", "9999");
		pr.setProperty("Dileep", "Donepudi");

		FileOutputStream fos = new FileOutputStream("abc.properties");
		pr.store(fos, "updated by durga for demo class");

	}

	private Properties readFileFromClasspath(String fileName) throws IOException {

		Properties p = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
		// InputStream inputStream = new FileInputStream(fileName);
		p.load(inputStream);
		return p;
	}

}
