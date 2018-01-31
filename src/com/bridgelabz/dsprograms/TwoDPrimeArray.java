package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Util;

public class TwoDPrimeArray 
{
	static int l=100;
	public static void main(String[]arg)
	{
		System.out.println("Enter Lower Limit:");
		int low ,high;
		low = Util.scanner.nextInt();
		System.out.println("Enter Higher Limit:");
		high = Util.scanner.nextInt();
		int prime[] =Util.checkPrime(low,high);
		arrayRepresentation(prime);
	}

	private static void arrayRepresentation(int[] prime) 
	{
		// TODO Auto-generated method stub
		int mRow,nCol,i,j,k=0;
		System.out.println("Enter The Size Of The Array:");
		mRow = Util.scanner.nextInt();
		nCol = Util.scanner.nextInt();
		int [][] twoDArray = new int [mRow][nCol]; 
		
		for(i=0;i<mRow;i++)
		{
			for(j=0;j<prime.length;j++)
			{
				twoDArray [i][j] = prime [k++]; 
				if(prime[i]<l)
					System.out.print(twoDArray[i][j]+"    ");
				else
					break;
			}
			System.out.print(twoDArray[i][j]+"    ");
			l+=100;
			System.out.println();
			
		}
	}
}
