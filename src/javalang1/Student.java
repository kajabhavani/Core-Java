package javalang1;
import java.lang.String;
import java.lang.System;

import javalang1.*;
public class Student {
	String name;
	int rollno;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public String toString()
	{
		//return name+"---->"+rollno;
		return "this is the student name"+name+"rollno"+rollno;
	}

	public static void main(String[] args) {

		Student s1=new Student("bhavani",101);
		Student s2=new Student("dileep",102);
		System.out.println(s1);
		
		System.out.println(s1.toString());
		System.out.println(s2);
		
		
	}

}
