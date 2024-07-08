package com.chainsys.skillmatrix;

import java.util.Arrays;

public class ArrayProduct {

	public static int[] productArray(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		
		int leftSideProduct = 1;
		for (int i = 0; i < n; i++) {
			result[i] = leftSideProduct;
			leftSideProduct *= nums[i];
		}
		int rightSideProduct = 1;
		for (int i = n - 1; i >= 0; i--) {
			result[i] *= rightSideProduct;
			rightSideProduct *= nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = {1, 3, 2, 4, 5};
		int[] result1 = productArray(nums);
		System.out.println(Arrays.toString(result1)); 
	}
}
