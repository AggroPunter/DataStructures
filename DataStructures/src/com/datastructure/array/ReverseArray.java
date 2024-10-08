package com.datastructure.array;

public class ReverseArray {
	
	public int[] reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] check = {1,2,3,4,5,6,7};
		new PrintArrayElements().printArray(check);
		System.out.println();
		int[] result = new ReverseArray().reverse(check, 0, check.length-1);
		new PrintArrayElements().printArray(result);
	}

}
