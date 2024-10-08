package com.datastructure.array;

//[1,2,3,4,6,7,8];
public class FindMissingElement {
	
	public int findMissingElement(int[] arr) {
		int n = arr.length+1;
		int sum = n * (n+1)/2;
		System.out.println(sum);
		for(int element : arr) {
			sum -= element;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n = new FindMissingElement().findMissingElement(new int[] {1,2,3,5,6,7,8});
		System.out.println(n);
		
		
	}

}
