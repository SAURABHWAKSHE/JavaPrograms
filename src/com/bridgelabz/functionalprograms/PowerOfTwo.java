package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class PowerOfTwo 
{
	static int power;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter The Power Of Two:");
		power = Util.scanner.nextInt();
		int i;
		Util.twoPower(power);
	}

}
