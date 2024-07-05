package com.chainsys.skillmatrix;

import java.util.Scanner;

public class NonRepeatDigitedNumbers {
	public static void main(String[] args) {
		int start = 10;
		int end = 25;
		int count = countNonRepeatNumbers(start, end);
		System.out.println("Count of non-repeat-digited numbers :"+ count);
	}
	public static int countNonRepeatNumbers(int start, int end) {
		int count = 0;
		for (int num = start; num <= end; num++) {
			if (!isRepeatingDigits(num)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isRepeatingDigits(int num) {
		String numStr = String.valueOf(num);
		if (numStr.length() >= 2 && numStr.charAt(0) == numStr.charAt(1)) {
			return true;
		}
		return false;
	}
}
