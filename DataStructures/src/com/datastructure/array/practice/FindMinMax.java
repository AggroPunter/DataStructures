package com.datastructure.array.practice;

public class FindMinMax {
	public static void main(String[] args) {
		
		int arr[] = {1,423,6,46,34,23,13,53,4};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		System.out.println("Min "+min +"\nMax "+max);
		
//        int a[]={1,423,6,46,34,23,13,53,4}; 
//        
//        //Implemented inbuilt function to sort array
//        Arrays.sort(a);
//    
//        // after sorting the value at 0th position will minimum and 
//      //nth position will be maximum
//      System.out.println("min-"+a[0]+" max-"+a[a.length-1]);
		
	}

}
