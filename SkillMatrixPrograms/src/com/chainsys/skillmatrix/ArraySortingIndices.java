package com.chainsys.skillmatrix;

public class ArraySortingIndices {
	public static void main(String[] args)   
	{  
		int[] arr = new int[] {4,5,3,7,1};  
		System.out.println("After sorting:");  
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  
				int tmp = 0;  
				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}  

			System.out.print(arr[i]+" ");  
		}  
	}  
}
