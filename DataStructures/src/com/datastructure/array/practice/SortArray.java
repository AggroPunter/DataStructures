package com.datastructure.array.practice;

import com.datastructure.array.PrintArrayElements;

public class SortArray {
	
	public static void main(String[] args) {
		
		int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
				    int temp = arr[i];
				    arr[i] = arr[j];
				    arr[j] = temp;
				}
			}
		}
		
		new PrintArrayElements().printArray(arr);
		
	}

}
