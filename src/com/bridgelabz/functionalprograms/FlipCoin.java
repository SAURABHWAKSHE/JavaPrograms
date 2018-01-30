package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class FlipCoin
{
	static int Number_Times,Number_Heads,Number_Tails;	
	public static void main(String[] arg)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to flip a coin that number times:");
		Number_Times = scanner.nextInt();
		int i;
		if(Number_Times>0)
		{
			for(i=0;i<Number_Times;i++)
			{
				if(Math.random()>0.5)
					Number_Heads++;
				else
					Number_Tails++;
			}
		}
		else
		{
			System.out.println("Run Again And Enter a positive Number");
			System.exit(0);
		}
		System.out.println("Heads:"+Number_Heads);
		System.out.println("Tails:"+Number_Tails);
		System.out.println("Head Percentage:"+(Number_Heads*100)/Number_Times);
		System.out.println("Tail Percentage:"+(Number_Tails*100)/Number_Times);
	}
}
