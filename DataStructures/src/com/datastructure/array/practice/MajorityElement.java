package com.datastructure.array.practice;

//Element which appears more than arr.size/2 times in array
public class MajorityElement {
	
	public static void main(String[] args) {
//		int[] arr = {1,1,2,1,3,5,1};
		int[] arr = {3,3,4,2,4,4,2,4};
		int check = arr.length/2;
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > check) {
				ans = arr[i];
			}
		}
		if(ans == 0) ans = -1;
		System.out.println(ans);
	}
}
