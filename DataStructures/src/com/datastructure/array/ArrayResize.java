package com.datastructure.array;

public class ArrayResize {
	
	public int[] reSize(int[] arr, int newCapacity) {
		int[] temp = new int[newCapacity];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,1,23,51,5,12};
		System.out.println(arr.length);
		
		arr = new ArrayResize().reSize(arr, 10);
		System.out.println(arr.length);
		
	}
}
