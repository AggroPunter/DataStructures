package com.datastructure.array.practice;
/*
 * Given a sorted array arr[] of size N and a number X, you need to find the number of occurrences of X in given array.
 */
public class CountOccurences {
	
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,33};
		int numberToCheck = 2;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == numberToCheck) {
				count++;
			}
		}
		
		System.out.println(count);
  	}

}
