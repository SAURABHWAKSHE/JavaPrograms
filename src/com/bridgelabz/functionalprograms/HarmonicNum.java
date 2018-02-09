package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.Util;

public class HarmonicNum
{
	static int HARMONIC_NUMBER;
	
	public static void main(String[]arg)
	{

		System.out.println("Enter The Value of Harmonic Number:");
		HARMONIC_NUMBER = Util.scanner.nextInt();
		Util.harmonicNumber(HARMONIC_NUMBER);
	}
}
