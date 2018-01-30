package com.bridgelabz.algorithmprograms;



import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class SortingAlgos 
{

	static String [] sTring ;
	static String [] algoArray = {"binarySearchString","binarySearchInt","insertionSortString","insertionSortInt","bubbleSortString","bubbleSortInt"};
	static int k=0,iNteger[];
	static double startTime;
	static double endTime;
	static String toFind;
	static int find;
	static double elapsedTime=0;
	static double eTime[] = new double[algoArray.length];
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
 		String str = sc.nextLine().toLowerCase();
 		System.out.println("Enter The String That You Want To Find");
		toFind = sc.next();
 		String [] sTring = str.split("\\s");
		System.out.println("Enter The Size Of int Array:");
		int i,len=0;
		len = sc.nextInt();
		int [] iNteger = new int[len];
		System.out.println("Enter Integer Array Elements: ");
		for(i=0;i<len;i++)
		{
			iNteger [i]= sc.nextInt();
		}
		System.out.println("Enter The value That You Want To Find");
		find = sc.nextInt();
		callAlgos(sTring,iNteger);
		sortElapsedTime();
		dispResult();
	}
	private static void dispResult() 
	{
		// TODO Auto-generated method stub
		int i;
		for(i=eTime.length-1;i>=0;i--)
		{
			System.out.println(algoArray[i]+" = "+eTime[i]);
		}
		
	}
	private static void sortElapsedTime() 
	{
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<eTime.length;i++)
		{
			for(j=0;j<eTime.length;j++)
			{
				if(eTime[i]>eTime[j])
				{
					//elapsed time sorting
					double temp = eTime[i];
					eTime[i] = eTime[j];
					eTime[j] = temp;
					//respective array sorting
					String temp1 = algoArray[i];
					algoArray[i] = algoArray[j];
					algoArray[j] = temp1;
				}
			 
			}
			
		}
		
	}
	private static void callAlgos(String[] sTring, int[] iNteger) 
	{
		// TODO Auto-generated method stub
		startTime = System.nanoTime();
		if(Util.binarySearchString(Util.bubbleSortString(sTring),toFind))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		endTime  = System.nanoTime();
		elapsedTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do binary search of String is = "+elapsedTime+" seconds");
		eTime[k++] = elapsedTime;
		
		startTime = System.nanoTime();
		if(Util.binarySearchInt(Util.bubbleSortInt(iNteger),find))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		endTime  = System.nanoTime();
		elapsedTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do binary search of Integers is = "+elapsedTime+" seconds");
		eTime[k++] = elapsedTime;
		
		startTime = System.nanoTime();
		Util.insertionSortString(sTring);
		endTime  = System.nanoTime();
		elapsedTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do insertion Sort of String is = "+elapsedTime+" seconds");
		eTime[k++] = elapsedTime;
		
		startTime = System.nanoTime();
		Util.insertionSortInt(iNteger);
		endTime  = System.nanoTime();
		elapsedTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do insertion Sort of Integers is = "+elapsedTime+" seconds");
		eTime[k++] = elapsedTime;
		
		startTime = System.nanoTime();
		Util.bubbleSortString(sTring);
		endTime  = System.nanoTime();
		elapsedTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do bubble Sort of String is = "+elapsedTime+" seconds");
		eTime[k++] = elapsedTime;
		
		
		startTime = System.nanoTime();
		Util.bubbleSortInt(iNteger);
		endTime  = System.nanoTime();
		elapsedTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do bubble Sort Integers is = "+elapsedTime+" seconds");
		eTime[k++] = elapsedTime;
		
	}
}
