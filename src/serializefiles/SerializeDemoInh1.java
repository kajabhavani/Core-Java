package serializefiles;
import java.io.*;

class Animal1 {
	int i=10;
	Animal1()
	{
		System.out.println("Animal Constructor called");
	}
}
class Dog2 extends Animal1 implements Serializable{
	int j=20;
	Dog2()
	{
		System.out.println("Dog Constructor called");
	}
}
public class SerializeDemoInh1 {

	public static void main(String[] args)throws Exception {
		
		Dog2 d1=new Dog2();
		d1.i=999;
		d1.j=888;
		FileOutputStream fos = new FileOutputStream("abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("deserialization Started");
		FileInputStream fis = new FileInputStream("abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog2 d2=(Dog2)ois.readObject();
		System.out.println(d2.i+"======"+d2.j);
		
		
		

	}

}
