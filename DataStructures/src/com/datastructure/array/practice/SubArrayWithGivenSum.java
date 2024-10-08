package com.datastructure.array.practice;

public class SubArrayWithGivenSum {
	
	public static void main(String[] args) {
		int[] arr = {15,2,4,8,9,5,10,23};
		int sum = 0;
		int expectedSum = 23;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=1; j<arr.length; j++) {
				if(sum > expectedSum) {
					
				}
				sum += arr[j];
			}
			
		}
		
	}

}
