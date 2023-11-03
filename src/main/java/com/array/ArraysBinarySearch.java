package com.array;

import java.util.Arrays;

public class ArraysBinarySearch 
{
	static void binarySearch(int [] arr)
	{
		int result = Arrays.binarySearch(arr, 5);
			if(result < 0)
				System.out.println("\n Element not found");
			else
				System.out.println("\n Element found at the location:"+result);
	}

	public static void main(String[] args) 
	{
		// Binary Search Example in Java using Arrays.binarySearch().,
		int [] arr = {9,2,8,4,0,5,6,7};
						
	}
}
