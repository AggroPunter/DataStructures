package com.datastructure.array.practice;

/*
 * Given an unsorted array, find a peak element in it. An element is considered to be peak if its value is greater than or equal to the values of its adjacent elements (if they exist). There can be more than one peak elements in an array, we return any of them,

Note: If the array is increasing then just print the last element will be the maximum value.

Example:

Input: arr[]= {5, 10, 20, 15}
Output: 20
 */

public class FindPeakWithNeighbours {
	public static void main(String[] args) {
		
		int[] arr = {5,10,20,15};
		int ans = 0;
		for(int i=1; i<arr.length; i++) {
			int previous = i-1;
			int next = i+1;
			if((arr[previous] < arr[i]) && (arr[next] < arr[i])) {
				 ans = arr[i];
				 break;
			}
		}
		System.out.println(ans);
		
		//Geeks
//		static int findPeak(int arr[], int n)
//	    {
//	        // First or last element is peak element
//	        if (n == 1)
//	            return 0;
//	        if (arr[0] >= arr[1])
//	            return 0;
//	        if (arr[n - 1] >= arr[n - 2])
//	            return n - 1;
//	        // Check for every other element
//	        for (int i = 1; i < n - 1; i++) {
//	            // Check if the neighbors are smaller
//	            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
//	                return i;
//	        }
//	        return 0;
//	    }
	}
}
