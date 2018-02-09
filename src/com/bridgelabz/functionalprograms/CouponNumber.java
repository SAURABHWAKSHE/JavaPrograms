package com.bridgelabz.functionalprograms;
import java.util.Arrays;
import com.bridgelabz.utility.Util;

public class CouponNumber 
{
	static int Number_Times,Number_Random;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter How Many Coupon Numbers You Want To Generate: ");
		Number_Times = Util.scanner.nextInt();
		int []distinctNumber =Util.randNumber(Number_Times,Number_Random);	
		for(i=0;i<distinctNumber.length;i++)
			System.out.println(distinctNumber[i]+" ");
	}
}

			

 

