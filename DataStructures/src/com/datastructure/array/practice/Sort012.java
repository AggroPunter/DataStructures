package com.datastructure.array.practice;

import com.datastructure.array.PrintArrayElements;

public class Sort012 {
	
	public static void main(String[] args) {
		
//		int[] arr = {0,1,2,0,1,2};
//		int c1=0, c2=0, c0=0;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == 0) c0++;
//			else if(arr[i] == 1) c1++;
//			else if(arr[i] == 2) c2++;
//		}
//		
//		int idx = 0;
//		for(int i=0; i<c0; i++) {
//			arr[idx++] = 0;
//		}
//		
//		for(int i=0; i<c1; i++) {
//			arr[idx++] = 1;
//		}
//		
//		for(int i=0; i<c2; i++) {
//			arr[idx++] = 2;
//		}
//		new PrintArrayElements().printArray(arr);
		
		//Dutch National Flag Algorithm
        int[] arr = {0, 1, 2, 0, 1, 2};
        sortColors(arr);
        
        // Output the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
		

	}
	
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
