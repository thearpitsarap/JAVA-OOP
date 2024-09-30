package com.cdac.acts.Customer;

public class Customer{
	private int itemCode;
	private double price;
	private int quantity;
	
	public Customer(){
		itemCode=0;
		price=0;
		quantity=0;
	}

	public Customer(int c,double p, int q){
		itemCode=c;
		price=p;
		quantity=q;
	}

	public void setQuantity(int q){
		quantity+=q;
	}

	public void setItemCode(int item){
                itemCode=item;
        }

        public void setPrice(double p){
                price=p;
        }

	
	public int getItemCode(){
		return itemCode;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getQuantity(){
		return quantity;
	}	
	
	@Override
	public String toString(){
		return " itemCode: "+ itemCode +  " price : " + price + " Quantity : " + quantity;
	}
}
