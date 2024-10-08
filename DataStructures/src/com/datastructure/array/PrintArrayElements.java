package com.datastructure.array;

public class PrintArrayElements {
	public void printArray(int[] arr) {
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
	}
	
	public static void main(String[] args) {
		new PrintArrayElements().printArray(new int[] {1,2,3,4,5,6});
	}

}
