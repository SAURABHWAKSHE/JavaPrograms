package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class Gambler
{
	 
	public static void main(String args[])
	  {
		 
		   double sTake,goalTarget;
		   int bet=0,betAmount;
		   System.out.println("Enter Usr Inputs:");
		   System.out.println("Enter The Amount That You Are HAving Intially To Play:");
		   sTake = Util.scanner.nextDouble();
		   System.out.println("Enter How Many Times You Want to  bet:");
		   bet= Util.scanner.nextInt();
		   System.out.println("Enter The Max Amount That You Want To Reach By Wining:");
		   goalTarget = Util.scanner.nextDouble();
		   System.out.println("Enter The Amount For Each bet And Win: ");
		   betAmount = Util.scanner.nextInt();
		   Util.betTrials(sTake,bet,goalTarget,betAmount);
	  }
	
	}
