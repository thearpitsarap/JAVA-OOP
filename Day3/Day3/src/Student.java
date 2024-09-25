package com.cdac.acts.Student;
public class Student
{
	static int rollno=100;
	static String name;
	static double  marks;
	Student(){
		 rollno++;
		 name="";
		 marks=0.0;
	}
	Student(String n,double m)
	{
		rollno++;
		name=n;
		marks=m;
		
	}
	public static void Display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll no :"+rollno);
		System.out.println("Marks :"+marks);
	}
	public static void main(String [] args)
	{
		Student s1=new Student();
		s1.Display();
		Student s2=new Student("Chaitanya",99.98);
		s2.Display();
		Student s3=new Student("Arpit",09.98);
		s3.Display();
		
		
	}
}
