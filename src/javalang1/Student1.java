package javalang1;

public class Student1 {

	String name;
	int rollno;
	Student1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	public boolean equals(Object obj)
	{
		try{
		String name1 = this.name;
		int rollno1 = this.rollno;
		Student1 s=(Student1)obj;
		String name2=s.name;
		int rollno2=s.rollno;
		if(name1.equals(name2) && rollno1 == rollno2)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		}
		catch(ClassCastException e){
			return false;
		}catch(NullPointerException e)
		{
			return false;
		}
		
	}
	public static void main(String[] args) {

		Student1 s1=new Student1("bhavani",101);
		Student1 s2=new Student1("dileep",102);
		Student1 s3=new Student1("bhavani",101);
		Student1 s4=s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(null));
		System.out.println(s1.equals("bhavani"));
		
		
	}

}
