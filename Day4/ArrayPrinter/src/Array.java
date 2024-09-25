package com.cdac.acts.Array;
public class Array{
	public static void print(int[] arr){
		System.out.print("Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.print("  "+arr[i]);
		}
		System.out.println();
	}
	public static void print(String[] arr){
		System.out.print("Elements : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}