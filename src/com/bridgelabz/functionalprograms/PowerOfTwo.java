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
		if(power<=31)
		{
			System.out.println("2's Powers Upto 2^"+power+":");
			for(i = 0;i<=power;i++)
			{
				System.out.println(Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("N should be less than or equal to 31");
		}
		
		

	}

}
