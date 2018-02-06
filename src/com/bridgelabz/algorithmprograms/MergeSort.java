package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Util;

public class MergeSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a String:");
		String strinput = Util.scanner.nextLine().toLowerCase();
		String[] string  = strinput.split(" ");
		try
		{
			String[] sortedArray = Util.mergeSort(string);
			System.out.println("Sorted Array Of Merge Sort:");
			for(int i=0;i<sortedArray.length;i++)
			{
				System.out.print(sortedArray[i]+" ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
