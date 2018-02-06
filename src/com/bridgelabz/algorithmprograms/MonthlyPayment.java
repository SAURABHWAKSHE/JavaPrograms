package com.bridgelabz.algorithmprograms;


import java.util.Scanner;

import com.bridgelabz.utility.Util;;

public class MonthlyPayment 
{
	static int Loan_Amount,Year_Taken; 
	static double Rate_Interest;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		System.out.println("Enter Principal Amount:");
		Loan_Amount = Util.scanner.nextInt();
		System.out.println("Enter ROI:");
		Rate_Interest = Util.scanner.nextDouble();
		System.out.println("Enter Number of Years that you have To make Payment:");
		Year_Taken = Util.scanner.nextInt();
		double mPayment = Util.monthlyPayment( Loan_Amount,Year_Taken, Rate_Interest);
		System.out.println("Monthly "+mPayment+" Rupees You have to pay as Installment");
	}
}
