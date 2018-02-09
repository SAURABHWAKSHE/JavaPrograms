package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Util;

public class FlipCoin
{
	static int NUMBER_TIMES;		
	public static void main(String[] arg)
	{
		System.out.println("Enter a number to flip a coin that number times:");
		NUMBER_TIMES = Util.scanner.nextInt();
		Util.flipCoin(NUMBER_TIMES);
	}
}
