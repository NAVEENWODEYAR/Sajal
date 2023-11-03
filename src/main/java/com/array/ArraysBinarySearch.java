package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBinarySearch 
{
	static void binarySearch(int [] arr)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Array given"+Arrays.toString(arr));
		System.out.println("\n Enter the search key:");
		int searchKey = sc.nextInt();
		int result = Arrays.binarySearch(arr, searchKey);
			if(result < 0)
				System.out.println("\n Element not found");
			else
				System.out.println("\n Element found at the location:"+result);
	}

	public static void main(String[] args) 
	{
		// Binary Search Example in Java using Arrays.binarySearch().,
		int [] arr = {9,2,8,4,0,5,6,7};
		binarySearch(arr);
	}
}
