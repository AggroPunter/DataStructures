package com.datastructure.array;

public class MinElementArray {
	
	public int findMin(int[] arr) {
		if(arr.length == 0 || arr == null)
			throw new IllegalArgumentException("Invalid Input");
		int min = arr[0];
		for(int element : arr) {
			if(element < min) {
				min = element;
			}
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		int output = new MinElementArray().findMin(new int[] {343,12,141,12,5,12,5});
		System.out.println(output);
		
	}

}
