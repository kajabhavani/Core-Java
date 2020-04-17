package COLLECTIONS;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PropertiesDemo2 {

	public static void main(String[] args) throws Exception {

		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("src/COLLECTIONS/db.properties");
		p.load(fis);
		System.out.println(p);
		/*String url=p.getProperty("url"); 
		String user=p.getProperty("user");
		String pwd=p.getProperty("pwd");
		try {
			Connection con=DriverManager.getConnection(url, user,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		p.setProperty("user", "kalyani");
		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos, "updated by durga for demo class");
		
		
		
		
	}

}
