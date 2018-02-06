package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Util;

public class HarmonicNum
{
	static int Harmonic_Number;
	
	public static void main(String[]arg)
	{

		System.out.println("Enter The Value of Harmonic Number:");
		Harmonic_Number = Util.scanner.nextInt();
		int i;
		double sumTotal=0;
		if(Harmonic_Number>0)
		{
			for(i=1;i<=Harmonic_Number;i++)
			{
				sumTotal = sumTotal + Math.pow(i,-1);
			}
		}
		else
		{
			System.out.println("Please Enter Value of N greater than 0 ");
			System.exit(0);
		}
		System.out.println(Harmonic_Number+"th Harmonic Value = "+sumTotal);
	}
}
