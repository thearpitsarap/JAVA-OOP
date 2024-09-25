package com.cdac.acts.Employee;

public class Employee{

	private static int empIdGenerator = 100;
	private int empId;
	private double salary;
	private String name;

	public Employee(){
		empId=empIdGenerator++;
		salary=0;
		name="";
	}

	public Employee(String n,double s){
		salary=s;
		name=n;
		empId=++empIdGenerator;
		System.out.println("Your Emp Id is : "+empId);
	}

	public int getId(){
		return empId;
	}

	public void Display(){
		System.out.println("EmpId : "+ empId);
		System.out.println("Name : "+ name);
		System.out.println("Salary : "+ salary);
		
	}
}
