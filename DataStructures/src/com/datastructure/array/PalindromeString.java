package com.datastructure.array;

public class PalindromeString {
	
	
	public boolean checkPalindromeString(String input) {
		char[] check = input.toCharArray();
		int start = 0;
		int end= check.length-1;
		for(int i=0; i<check.length; i++) {
			if(check[start] != check[end]) {
				return false;
			}
			start++;
			end--;
		}
	
		return true;
	}
	
	public static void main(String[] args) {
		if(new PalindromeString().checkPalindromeString("maam"))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
