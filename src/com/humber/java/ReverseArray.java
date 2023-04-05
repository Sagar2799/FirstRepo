package com.humber.java;

public class ReverseArray {
	
	public static void main(String [] args) {
		Integer[] intArray = {10,20,30,40,50};
		
		System.out.print("Old Array: ");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
	
	System.out.print("Reverse Order :");
	for(int i=intArray.length-1;i>=0; i--)
		System.out.print(intArray[i] +" ");
	}
}

	
