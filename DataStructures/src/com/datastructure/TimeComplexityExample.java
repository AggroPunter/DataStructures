package com.datastructure;

public class TimeComplexityExample {
	
	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		
		TimeComplexityExample example = new TimeComplexityExample();
		System.out.println(example.sum(99999));
		
		System.out.println("Time Taken : "+(System.currentTimeMillis() - now) + "millisecs");
	}
	
	public int sum(int n) {
		return n * (n+1) / 2;
	}
	
//	public int sum(int n) {
//		int sum = 0;
//		for(int i=1; i<=n; i++) {
//			sum+=i;
//		}
//		return sum;
//	}
}
