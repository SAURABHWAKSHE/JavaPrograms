package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class MergeSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = scan.nextLine().toLowerCase();
		String[] string  = str.split(" ");
		try
		{
			String[] sortedArray = mergeSort(string);
			System.out.println("Sorted Array:");
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

	private static String[] mergeSort(String[] string) 
	{
		// TODO Auto-generated method stub
		int i,j,k;
		if(string.length==0)
			return null;
		if(string.length>1)
		{
			int mid = string.length/2;
			String[] lowerHalf = new String[mid];
			String[] higherHalf = new String[string.length-mid];
			for(i=0;i<mid;i++)
			{
				lowerHalf[i] = string[i];
			}
			
			for(i=mid;i<string.length;i++)
			{
				higherHalf[i-mid] = string[i];
			}
			mergeSort(lowerHalf);
			mergeSort(higherHalf);
			
			i=0;
			j=0;
			k=0;
			//merge left and right Array
			while(i<lowerHalf.length && j<higherHalf.length)
			{
				if(lowerHalf[i].compareTo(higherHalf[j])<0)
					string[k++] = lowerHalf[i++];
				else
					string [k++] = higherHalf[j++];
			}
			//merge Remaining Array
		
			while(i<lowerHalf.length)
				string[k++] = lowerHalf[i++];
			while(j<higherHalf.length)
				string[k++] = higherHalf[j++];
		}
		return string;
	}

}
