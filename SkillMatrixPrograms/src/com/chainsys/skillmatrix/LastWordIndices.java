package com.chainsys.skillmatrix;

import java.util.Scanner;

public class LastWordIndices {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a String:");
		String str= scanner.nextLine();
		int length=lengthOfLastWord(str);
		System.out.println("Length of Last String:"+ length);
	}
	public static int lengthOfLastWord(String str) {
		int length=0;
		int indices=(str.length()-1);	
		while(indices>=0 && str.charAt(indices)!=' ') {
			length++;
			indices--;
		}
		return length;
	}
}
