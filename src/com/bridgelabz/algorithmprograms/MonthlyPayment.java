package com.bridgelabz.algorithmprograms;


import java.util.Scanner;

import com.bridgelabz.utility.Util;;

public class MonthlyPayment 
{
	static int loanAmount,yYear; 
	static double rate;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount:");
		loanAmount = sc.nextInt();
		System.out.println("Enter ROI:");
		rate = sc.nextDouble();
		System.out.println("Enter Number of Years that you have To make Payment:");
		yYear = sc.nextInt();
		double mPayment = Util.monthlyPayment( loanAmount,yYear, rate);
		System.out.println("Monthly "+mPayment+" Rupees You have to pay as Installment");
	}
	
	
}
