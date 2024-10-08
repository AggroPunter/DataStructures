package com.datastructure.array.practice;

/*
 * Given an array arr[] of N distinct elements and a number K, where K is smaller than the size of the array.
 * Find the K’th smallest element in the given array.
 * 
 * Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
	Output: 7
 */

public class Kth_Smallest {

	public static void main(String[] args) {
		
		int arr[] = {7, 10, 4, 3, 20, 15};
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			count++;
			if(count == 3) { // K = 3 
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
