package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class BubbleSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size:");
		int n,i,j;
		n = sc.nextInt();
		int [] aArr = new int [n];
		System.out.println("Enter The Array Elements:");
		for(i = 0;i<n;i++)
		{
			aArr[i] = sc.nextInt();
		}
		int [] aArrSorted = Util.bubbleSort(aArr,n);
		
		System.out.println("Sorted Array:");
		for(i = 0;i<n;i++)
		{
			System.out.print(aArrSorted[i]+" ");
		}
	}
}
	
