package com.array;

public class BinarySearch 
{
	static void binarySearch(int[] arr, int first, int last,int key)
	{
		int mid = (first+last)/2;
			while(first <= last)
			{
				if(arr[mid] < key)
				{
					first = mid + 1;
				}
				else if(arr[mid] == key)
				{
					System.out.println("\n Element found at index:"+mid);
					break;
				}
				else
				{
					last = mid - 1;
				}
				mid = (first+last)/2;
			}
			if(first > last)
			{
				System.out.println("\n Element not found");
			}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Binary Search \n");
		int[] arr = {1,19,4,3,28,7,0,9,20,02,07,01};
		binarySearch(arr, 0,arr.length-1 , 28);
	}

}
