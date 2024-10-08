package com.datastructure.array.practice;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {
	
	
	
	private static void findUnion(int[] arr1, int[] arr2) {
		Set<Integer> unionSet = new HashSet<>();
		Set<Integer> intersectionCheckSet = new HashSet<>();
		Set<Integer> intersectionResultSet = new HashSet<>();
		
		for(int num : arr1) {
			unionSet.add(num);
			intersectionCheckSet.add(num);
		}
		
		for(int num : arr2) {
			unionSet.add(num);
			if(intersectionCheckSet.contains(num)) {
				intersectionResultSet.add(num);
			}
		}
		
		System.out.println("Union "+unionSet);
		System.out.println("Intersection "+intersectionResultSet);
	}

	public static void main(String[] args) {
		
		int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        findUnion(arr1, arr2);
        

		
	}
}
