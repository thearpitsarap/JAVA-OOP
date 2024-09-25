package com.cdac.acts.Main;

import java.util.Scanner;
import com.cdac.acts.Employee.Employee;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count=0;
		int choice=0;
		Employee emp[] = new Employee[20];

		do{
			
		
			System.out.println("****Menu****");
			System.out.println("1.Add Employee");
			System.out.println("2.Print Employee by Id");
			System.out.println("3.Sort Employee by Salary");
			System.out.println("0.Exit");
			
			choice = sc.nextInt();
			sc.nextLine();

			switch(choice){
				case 1:{
					System.out.print("Enter name : ");
					String name = sc.nextLine();

					System.out.println("Enter Salary");
					double salary = sc.nextDouble();
					sc.nextLine();
					
					Employee e = new Employee(name,salary);
					emp[count]=e;

					System.out.println("From Main Class : " + e.getId());
					count++;
				}break;
				case 2:{
                                        System.out.print("Enter Employee Id : ");
                                        int id = sc.nextInt();
					
					for(int i=0;i<count;i++){
						if(emp[i].getId()==id){
							emp[i].Display();
							break;
						}
					}

                                }break;
			}
			
		}while(choice != 0);
	}
}
