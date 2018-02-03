package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Util;

public class primeAnagramQueue 
{
	public static void main(String[]arg) throws Exception
	{
		System.out.println("Enter Lower Limit:");
		int low ,high;
		low = Util.scanner.nextInt();
		System.out.println("Enter Higher Limit:");
		high = Util.scanner.nextInt();
		Util.primeAnagramQueue(low ,high);
	}
	
}
