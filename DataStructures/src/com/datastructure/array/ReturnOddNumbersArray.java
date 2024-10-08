package com.datastructure.array;

public class ReturnOddNumbersArray {
	
	public int[] returnCount(int[] arr) {
		String numbers = "";
		for(Integer element : arr) {
			if(element % 2 != 0) {
				numbers = numbers.concat(element.toString());
			}
		}
		
		int[] oddArray = new int[numbers.length()];
		for(int i=0; i<numbers.length(); i++) {
			oddArray[i] = numbers.charAt(i) - '0';
		}
		
		return oddArray;
	}
	
	public static void main(String[] args) {
		int[] result = new ReturnOddNumbersArray().returnCount(new int[] {1,2,3,4,5,6});
		new PrintArrayElements().printArray(result);
	}

}
