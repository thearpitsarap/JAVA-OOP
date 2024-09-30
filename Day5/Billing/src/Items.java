package com.cdac.acts.Items;

public class Items{
        private int itemCode;
        private String name;
        private double price;
        private int quantity;

        public Items(){
                itemCode=0;
                name="";
                price=0;
                quantity=0;
        }

        public Items(int c,String s,double p, int q){
                itemCode=c;
                name=s;
                price=p;
                quantity=q;
        }

        public void setQuantity(int q){
                quantity-=q;
        }

        public int getItemCode(){
                return itemCode;
        }
        public String getName(){
                return name;
        }
        public double getPrice(){
		return price;
        }
        
	public int getQuantity(){
                return quantity;
        }

        @Override
        public String toString(){
                return " itemCode: "+ itemCode + " name: " + name + " price : " + price + " Quantity : " + quantity;
        }
}

