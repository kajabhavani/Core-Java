package serializefiles;
import java.io.*;
class Dog1 implements Serializable
{
	Cat C=new Cat();
}
class Cat implements Serializable{
	Rat R=new Rat();
}

class Rat implements Serializable{
	int j=20;
}

public class ObjectGraphs {

	public static void main(String[] args)throws Exception {
      
		Dog1 d1=new Dog1();
		System.out.println(d1.C.R.j);
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1)ois.readObject();
		System.out.println("value of j::::::"+d2.C.R.j);

		
	}

}
