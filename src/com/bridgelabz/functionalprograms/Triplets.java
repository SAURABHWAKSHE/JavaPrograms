package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Util;

public class Triplets  
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Value Of N:");
		int arraySize = Util.scanner.nextInt();
		int i,sum=0,j,k;
		int count = 0;
		int tripletArray[] = new int[arraySize];
		System.out.println("Enter Array ELements:");
		for(i=0 ;i<arraySize;i++)
		{
			tripletArray[i] = Util.scanner.nextInt();
		}
		count = Util.triplets(tripletArray);
		System.out.println("Total Number Of Distinct Triplets Generated:"+count);

	}

}
