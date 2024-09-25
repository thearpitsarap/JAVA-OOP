package com.cdac.acts.Student;

public class Student{
	private static int rollnoGenerator=100;
	private int rollno;
	private String name;
	private double marks;
	
	public Student(){
		rollno=++rollnoGenerator;
		name="";
		marks=0.0;
	}

	public int getRoll(){
		return rollno;
	}
	
	public Student(String n,double m){
		name=n;
		marks=m;
		rollno=++rollnoGenerator;
		System.out.println("Your Id is :" + rollno);
	}

	public void Display(){
		System.out.println("Name  : "+ name);
		System.out.println("Roll no  : "+ rollno);
		System.out.println("Marks  : "+ marks);
	}

	public static Student[] Sort(Student[] s,int count){
		for (int i = 0; i < count; i++) {
    		double tm = Double.MAX_VALUE; 
    		int k = i; 
    		for (int j = i; j < count; j++) {
        			if (s[j].marks < tm) {
            			tm = s[j].marks; 
            			k = j; 
        		}
    		}
    		
    		Student temp = s[i];
    		s[i] = s[k];
    		s[k] = temp;
		}
		return s;
	}
			
}
