package com.datastructure.array;

public class FindSecondMax {
	
	public int findSecondMax(int[] arr) {
		int max = 0;
		int secondMax = 0;
		for(int element : arr) {
			if(element > max) {
				secondMax = max;
				max = element;
			}
			else if(element > secondMax && element != max) {
				secondMax = element;
			}
		}
		
		return secondMax;
	}
	
	
	public static void main(String[] args) {
		int output = new FindSecondMax().findSecondMax(new int[] {1,4,5,2,1,12,53});
		System.out.println(output);
	}

}
