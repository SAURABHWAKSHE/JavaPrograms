package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Util;

public class NumFinder 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter power of Two:");
		int range,maxPower;
		maxPower= Util.scanner.nextInt();
		range= (int) Math.pow(2,maxPower);
		int startPoint=0,endPoint=range-1;
		System.out.println("Guess a Num Between "+startPoint+" and "+endPoint);
		int num = Util.findNum(startPoint,endPoint);
		System.out.println("I Think "+num+" is your Number");
	}
}
	

