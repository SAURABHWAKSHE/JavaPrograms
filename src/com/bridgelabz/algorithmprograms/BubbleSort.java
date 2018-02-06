package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class BubbleSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter The Array Size:");
		int arrSize,i,j;
		arrSize = Util.scanner.nextInt();
		int [] aArray = new int [arrSize];
		System.out.println("Enter The Array Elements:");
		for(i = 0;i<arrSize;i++)
		{
			aArray[i] = Util.scanner.nextInt();
		}
		int [] aArrSorted = Util.bubbleSortInt(aArray);
		
		System.out.println("Sorted Array:");
		for(i = 0;i<arrSize;i++)
		{
			System.out.print(aArrSorted[i]+" ");
		}
	}
}
	
