package serializefiles;
import java.io.*;

public class ExternalizableDemo implements Externalizable {
	String s;
	  int i;
	  int j;
	  
	  public ExternalizableDemo(){		  
		  System.out.println("public no-arg constructor");
	  }
	 public  ExternalizableDemo(String s,int i,int j){
		  this.s=s;
		  this.i=i;
		  this.j=j;
	  }
	 public void writeExternal(ObjectOutput out)throws IOException
	 {
		 out.writeObject(s);
		 out.writeInt(i);
	 }
 public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException
 {
	 s=(String)in.readObject();
	 i=in.readInt();
 }
	public static void main(String[] args) throws Exception {
		ExternalizableDemo e1=new ExternalizableDemo("bhavani",10,20);
		
		FileOutputStream fos = new FileOutputStream("def.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		FileInputStream fis = new FileInputStream("def.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo e2=(ExternalizableDemo)ois.readObject();
		System.out.println(e2.s+"====="+e2.i+"====="+e2.j);
		
		
		

		  
		  
		  
		  
		  
	}

}
