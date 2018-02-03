package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Util;

public class BankCashQueue 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter The Amount That Bank Have Intially:");
		int initCash = Util.scanner.nextInt();
		System.out.println("Enter The Numbers Of People that you want to add to queue:");
		int numPeople = Util.scanner.nextInt();
		Util.cashCounter(initCash,numPeople);
	}

}
