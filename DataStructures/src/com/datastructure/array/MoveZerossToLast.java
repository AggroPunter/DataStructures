package com.datastructure.array;

public class MoveZerossToLast {
	
	public int[] moveZeros(int[] arr) {
		int j = 0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0) {
				j++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,0,2,23,12,0,12,88,0};
		new PrintArrayElements().printArray(arr);
		System.out.println();
		arr = new MoveZerossToLast().moveZeros(arr);
		new PrintArrayElements().printArray(arr);
		
	}

}
