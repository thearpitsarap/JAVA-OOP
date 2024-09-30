package com.cdac.List.test;

import com.cdac.List.impl.FixedList;
import com.cdac.List.impl.GrowableList;

public class Main {
	 public static void main(String[] args) {
		FixedList fl = new FixedList();
		
		for(int i=0;i<5;i++) {
			fl.insert(i);			
		}
		
		fl.insert(7);
		
		for(int i=0;i<5;i++) {
			System.out.println(fl.retrive(i));			
		}
		 
//		GrowableList sl = new GrowableList();
//		for(int i=0;i < 7;i++) {
//			sl.insert(i);
//		}
//		
//		for(int i=0;i<7;i++) {
//			System.out.println(sl.retrive(i));
//		}
//		
//		System.out.println(sl.retrive(8));
		
	}
}