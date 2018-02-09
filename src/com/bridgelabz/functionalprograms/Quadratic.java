package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class Quadratic
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter The value For a,b and c:");
		int paramA,paramB,paramC;
		paramA = Util.scanner.nextInt();
		paramB = Util.scanner.nextInt();
		paramC = Util.scanner.nextInt();
		Util.solveEquation(paramA,paramB,paramC);

	}

}
