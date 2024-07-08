package com.chainsys.skillmatrix;

import java.util.Scanner;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int j = 1; 
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[j - 1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j; 
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a limit:");
		int n = scanner.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the Number of elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		int len = removeDuplicates(nums);
		System.out.println("Length of without duplicate array: " + len);
		System.out.print("Modified array: ");
		for (int i = 0; i < len; i++) {
			System.out.print(nums[i] + " ");
		}
		scanner.close();
	}
}
