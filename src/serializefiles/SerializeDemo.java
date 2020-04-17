package serializefiles;
import java.io.*;

class Dog implements Serializable
{
	int i=10;
	int j=20;
	//transient int j=20;
}
public class SerializeDemo {

	public static void main(String[] args) throws Exception{
    Dog d1 =  new Dog();
    
    System.out.println(d1.i+"-----"+d1.j);

    
    FileOutputStream fos=new FileOutputStream("C:\\Users\\Donepudi\\GDE\\Bhavani\\abc.ser");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(d1);
    
    FileInputStream fis=new FileInputStream("C:\\Users\\Donepudi\\GDE\\Bhavani\\abc.ser");
    ObjectInputStream ois=new ObjectInputStream(fis);
    Dog d2=(Dog)ois.readObject();
    
    System.out.println(d2.i+"-----"+d2.j);
    
    
	}

}
