package com.cdac.List.impl;

import com.cdac.List.MyList;

public class GrowableList implements MyList{
	private int size;
	private int currIndex;
	private int arr[];
	
	public GrowableList() {
		this.size = 5;
		this.currIndex = 0;
		this.arr = new int[size];
	}
	
	@Override
	public void insert(int n) {
		if(currIndex==size) {
			size = size * 2;
			int newArr[] = new int[size];
			for(int i=0;i<currIndex;i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[currIndex++] = n;
	}
	
	
	@Override
	public int retrive(int n) {
		if(n > currIndex) {
			System.out.println("Element does't Exist");
			return -1;
		}
		return arr[n];
	}
}
