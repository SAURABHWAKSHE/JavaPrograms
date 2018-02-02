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
		//arrayRepresentation(prime);
		anagramArray(prime);
	}
	private static void anagramArray(int[] prime) 
	{
		int i,j,k=0,l;
		int dupPrime[] = prime;
		System.out.println("Enter The Size Of The Array:");
		int mRow = Util.scanner.nextInt();
		int nCol = Util.scanner.nextInt();
		int [][] primeAnagram = new int[mRow][nCol];
		int [][] primeNotAnagram = new int[mRow][nCol];
		for(i=0;i<prime.length;i++)
        {

       	 	for(j = i+1;j<prime.length;j++)
            {
       	 		String str = Integer.toString(prime[i]);
       	 		String str1 = Integer.toString(dupPrime[j]);
       	 		l=j++;
       			if(Util.isAnagram(str,str1))
       			{
       				//System.out.print(str+"  "+str1);
       				//System.out.println();
       				primeAnagram[i][k++] = prime[i];
       				
       				primeAnagram[i][k++] = dupPrime[j];
       			}
       			else
       			{
       				primeNotAnagram[i][k++] = prime[i];
       				primeNotAnagram[i][k++] = dupPrime[j];
       			} 
       	     }
       	 	
        }
	}
	private static void arrayRepresentation(int[] prime) 
	{
		// TODO Auto-generated method stub
		int mRow,nCol,i,j,k=0,l=0;
		System.out.println("Enter The Size Of The Array:");
		mRow = Util.scanner.nextInt();
		nCol = Util.scanner.nextInt();
		int [][] twoDArray = new int [mRow][nCol]; 
		for(i=0;i<mRow;i++)
		{
			l+=100;
			for(j=0;j<prime.length;j++)
			{
				twoDArray [i][j] = prime [k]; 
				if(twoDArray [i][j]<=prime[prime.length-1])
				{
					if(prime[k]>=l)
					{
						System.out.println();
						System.out.print("   "+twoDArray[i][j]);
						break;
					}
					System.out.print("   "+twoDArray[i][j]);
					k++;
				}
				else
					break;
			}
		}
	}
	
}

