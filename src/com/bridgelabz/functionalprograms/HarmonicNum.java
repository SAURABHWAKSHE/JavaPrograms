package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class HarmonicNum
{
	static int n;
	
	public static void main(String[]arg)
	{
		Scanner scv = new Scanner(System.in);
		System.out.println("Enter The Value of N:");
		n = scv.nextInt();
		int i;
		double sum=0;
		if(n>0)
		{
			for(i=1;i<=n;i++)
			{
				sum = sum + Math.pow(i,-1);
			}
		}
		else
		{
			System.out.println("Please Enter Value of N greater than 0 ");
			System.exit(0);
		}
		System.out.println(n+"th Harmonic Value = "+sum);
	}
}
