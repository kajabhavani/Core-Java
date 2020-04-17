package basics;

public class StudentO {

	public static void main(String[] args) {

		Student s1=new Student();
		
		s1.setStuid(101);
		s1.setSname("bhavani");
		s1.setCourse("corejava");
		
		System.out.println(s1.getStuid());
		System.out.println(s1.getSname());
		System.out.println(s1.getCourse());
		
		System.out.println(s1);
		
	}

}
