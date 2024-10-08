package com.datastructure.array.oob;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.IntConsumer;

public class ArrayOutOfBox {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2,4,5,6,7,9};
		
		Integer[] integerArray = Arrays.stream(arr) // Convert int[] to IntStream
                .boxed()           // Box each int to Integer
                .toArray(Integer[]::new);
		
		List<Integer> a = Arrays.asList(integerArray);
		
		System.out.println(a);
		
		int ans = Arrays.binarySearch(arr,8);
		
		//returns -8 means the value can be inserted at index 7 in arr
		System.out.println(ans);
		
		int[] copy = Arrays.copyOf(arr, arr.length);
		System.out.println("Printing copied array elements");
		print(copy);
		
		int[] secondCopy = Arrays.copyOf(arr, 3);
		System.out.println("Copied only first 3 elements of array");
		print(secondCopy);
		
		int[] thirdCopy = Arrays.copyOf(arr, 15);
		System.out.println("Creating array size greater than the actual array");
		print(thirdCopy);
		
		Arrays.fill(thirdCopy, 8, 15, 2);
		print(thirdCopy);
		
		Arrays.sort(thirdCopy);
		print(thirdCopy);
		
		int[] rangeCopy = Arrays.copyOfRange(thirdCopy, 1, 5);
		System.out.println("Copying from range 2 to 7 " );
		print(rangeCopy);
		
		int[] secondArr = {1,3,3,4,5,6,7,9};
		boolean check = Arrays.equals(arr, secondArr);
		/*
		 * Use Arrays.equals for flat arrays.
		   Use Arrays.deepEquals for nested arrays or when you need to compare the contents deeply.
		 */
		System.out.println("Checking if both arrays are equal "+ check);
		
		
//		System.out.println(Arrays.hashCode(arr));
//		System.out.println(Arrays.hashCode(secondArr));
		
		System.out.println("Comparing arr1 and arr2");
		int hello = Arrays.compare(arr, secondArr);
		System.out.println(hello);
		
		int misMatch = Arrays.mismatch(arr, secondArr);
		//returns index at which element mismatches. returns -1 if arrays are equal or if array is null
		System.out.println("Checking mismatch "+misMatch);
		
		Arrays.parallelPrefix(arr, (hi,bye) -> hi+bye);
		System.out.println("Using ParallelPrefix method");
		print(arr);
		
		int[] emptyArr = new int[10];
		System.out.println("Printing empty array using parallelSetAll method");
		Arrays.parallelSetAll(emptyArr, index -> index + 1);
		print(emptyArr);
		
		System.out.println("Using Arrays Parallelsort method");
		//Same as parallelSort but executes sequentially
		Arrays.setAll(emptyArr, index -> index*5);
		print(emptyArr);
		
		
		 Spliterator.OfInt spliterator = Arrays.spliterator(arr);

	        // Process all elements using forEachRemaining
	        System.out.println("Processing all elements:");
	        spliterator.forEachRemaining((IntConsumer)System.out::println);  // Print each element

	        // Reset the Spliterator by creating a new one
	        spliterator = Arrays.spliterator(arr);

	        // Try to split the Spliterator
	        Spliterator.OfInt split = spliterator.trySplit();

	        // Check if the split was successful and process split elements
	        if (split != null) {
	            System.out.println("Processing split elements:");
	            split.forEachRemaining((IntConsumer)System.out::println);  // Print each element in the split
	        }

	        // Process remaining elements in the original Spliterator
	        System.out.println("Processing remaining elements:");
	        spliterator.forEachRemaining((IntConsumer)System.out::println); 
		
	}

	private static void print(int[] copy) {
		// TODO Auto-generated method stub
		for(int element : copy) {
			System.out.print(element+", ");
		}
		System.out.println();
	}

}
