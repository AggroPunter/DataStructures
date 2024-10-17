package com.datastructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGeneration {
	
	private String[] generateBinaryNumbers(int n) {
		String[] result = new String[n];
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");
		for(int i=0; i<n; i++) {
			result[i] = queue.poll();
			String n1 = result[i] + "0";
			String n2 = result[i] + "1";
			queue.offer(n1);
			queue.offer(n2);
		}
		return result;
		/*
		 * 
		 * 				1
		 * 			10		11
		 * 		100				101
		 *	110						111 
		 *
		 */
	}

	
	public static void main(String[] args) {
		BinaryNumberGeneration binary = new BinaryNumberGeneration();
		String[] result = binary.generateBinaryNumbers(10);
		for (String string : result) {
			System.out.print(string + "-> ");
		}
		
	}
}
