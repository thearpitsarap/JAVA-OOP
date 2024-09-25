package com.cdac.acts.Main;
import com.cdac.acts.Student.Student;
import java.util.Scanner;

public class Main{
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		Student s[] = new Student[20];;
		int count=0;
		
		do{
			System.out.println("1.Add ");
			System.out.println("2.Print By Roll No");
			System.out.println("3.Sort");
			System.out.println("0.Exit");
			
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			
			switch(choice){
				case 1:{
					sc.nextLine();
					System.out.println("Please enter name");
					String name = sc.nextLine();
					
					System.out.println("Please enter marks");
					double marks = sc.nextDouble();
					
					Student obj=new Student(name,marks);
					s[count]=obj;

					System.out.println("From Main "+obj.getRoll());
					count++;
				}break;
				case 2:{
					System.out.println("Enter Roll No ");
					int roll = sc.nextInt();
					for(int i=0;i<count;i++){
						if(s[i].getRoll() == roll){
							System.out.println("Here");
							s[i].Display();
							break;
						}else{
                                                        System.out.println("Not found");
                                                }

					}
				}break;
				case 3:{
					Student s1 = new Student();
					Student[] ans = s1.Sort(s,count);
				}break;
			}
			
			
		}while(choice != 0);
	}
}
