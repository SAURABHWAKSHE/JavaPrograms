package com.bridgelabz.functionalprograms;
import java.util.Arrays;
import com.bridgelabz.utility.Util;

public class CouponNumber 
{
	static int Number_Times,Number_Random;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter How Many Coupon Numbers You Want To Generate: ");
		Number_Times = Util.scanner.nextInt();
		System.out.println("Enter range to generate Random Number:");
		Number_Random = Util.scanner.nextInt();
		randNumber(Number_Times,Number_Random);	
	}
	
	public static boolean contains(int[] array, int item)
	{
		for (int number : array)
		{
			if (item == number) 
			{
				return true;
			}
		}
		return false;
	}     
	

	public static void randNumber(int Number_Times,int Number_Random)
	{
		int i,count=0,distinct=0;
		double random;
		int [] dDistinct ;
		/*
		 * Array Declaration to Store Distinct Numbers
		 */
	
		dDistinct = new int [Number_Times];
		while(distinct<Number_Times)
		{
			random  =  Math.random() * Number_Random;
			count++;
			if(contains(dDistinct,(int) random))
				continue;
			else
			{
				dDistinct[distinct++] = (int)random;
				
			}
			/*if(distinct == Number_Times)
				break;*/
		}
		
		System.out.println("we need to generate "+count+" random numbers to print "+Number_Times+" distinct Coupon Numbers.");
		for(i=0;i<dDistinct.length;i++)
			System.out.println(dDistinct[i]+" ");
    }
}

			

 

