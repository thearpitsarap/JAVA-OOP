package com.cdac.acts.Main;
import java.util.Scanner;
import com.cdac.acts.Items.Items;
import com.cdac.acts.Customer.Customer;

public class Main{
	
	public static void main(String[] args){
		Items b1 = new Items(101,"Apple",4000,10);
		Items b2 = new Items(102,"Orange",78000,10);
		Items b3 = new Items(103,"Banana",65000,10);
		Items b4 = new Items(104,"Avacado",96000,10);

		Items items[] = {b1,b2,b3,b4};
	
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		int count = 0;
		Customer customer[] = new Customer[4]; 
		do{
		
			System.out.println("****Menu****");
			System.out.println("1. Display Stock");	
			System.out.println("2. But item by item code");
			System.out.println("3. Display bill");
			
			System.out.print("Enter your choice");
			ch = sc.nextInt();

			switch(ch){
				case 1:{
					for(int i=0;i<4;i++){
						System.out.println(items[i]);
					}
				}break;
				case 2:{
					System.out.print("Enter Item Code : ");
					int c = sc.nextInt();

					boolean found = false;
					boolean found1 = false;
					
					System.out.print("Enter Quantity : ");
					int q = sc.nextInt();

					for(int i=0;i<count;i++){
						if(customer[i].getItemCode()==c){
							customer[i].setQuantity(q);
							for(int k=0;k<items.length;k++){
								if(c == items[k].getItemCode()){
									items[k].setQuantity(q);
									break;
								}
							}
							found1 = true;
							break;
						}
					}
					
					if(!found1){
						for(int i=0;i<4;i++){
						if(items[i].getItemCode() == c){
							items[i].setQuantity(q);
							customer[count] = new Customer();
							customer[count].setQuantity(q);
							customer[count].setItemCode(items[i].getItemCode());
							customer[count].setPrice(items[i].getPrice());
							found = true;
							count++;
							break;
						}
					}
						if(!found){
							System.out.println("Please Enter correct Item Code");
						} 
					}
				}break;
				case 3:{
					double ans=0;
					for(int i=0;i<count;i++){
						ans = ans + (customer[i].getPrice() * customer[i].getQuantity());
					}
					System.out.println("Total : "+ans);
				}break;

			}			

		}while(ch!=0);
	}
}
