package com.cdac.List.impl;

import com.cdac.List.MyList;
import com.cdac.List.MyExceptions.ListFullException;

public class FixedList implements MyList {
	private int arr[];
	private final int size;
	private int currIndex;
		
	public FixedList() {
		this.currIndex = 0;
		this.size = 5;
		this.arr = new int[size];
	}
	
	@Override
	public void insert(int n) {
		if(n > currIndex) {
			throw new ListFullException("List is Full");
		}
		this.arr[currIndex] = n;
		this.currIndex++;
	}
	
	@Override
	public int retrive(int n) {
		if(n > currIndex) {
			System.out.println("Invalid Index");
			return 0;
		}
		return arr[n];
	}
}