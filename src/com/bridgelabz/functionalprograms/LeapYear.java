package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class LeapYear 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year:");
		int lYear = sc.nextInt();
		boolean islYear=false;
		if(Integer.toString(lYear).length()==4)
		{
			if(Util.LeapYear(lYear))
				System.out.println(lYear+" is a Leap Year");
			else
				System.out.println(lYear+" is not a Leap Year");
		}
		else
		{
			System.out.println("Year Must be of 4 Digit...Run Again");
			System.exit(0);
		}
	}

}
