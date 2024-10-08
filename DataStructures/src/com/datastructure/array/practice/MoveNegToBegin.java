package com.datastructure.array.practice;

import java.util.Arrays;

import com.datastructure.array.PrintArrayElements;

public class MoveNegToBegin {
	
	public static void main(String[] args) {
		
		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		int j=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		
		new PrintArrayElements().printArray(arr);

	}

}
