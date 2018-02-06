package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class Gambler
{
	 
	  static int Bet_Amount;
	  public static void main(String args[])
	  {
		 
		   double sTake,goalTarget;
		   int bet=0;
		   System.out.println("Enter Usr Inputs:");
		   System.out.println("Enter The Amount That You Are HAving Intially To Play:");
		   sTake = Util.scanner.nextDouble();
		   System.out.println("Enter How Many Times You Want to  bet:");
		   bet= Util.scanner.nextInt();
		   System.out.println("Enter The Max Amount That You Want To Reach By Wining:");
		   goalTarget = Util.scanner.nextDouble();
		   System.out.println("Enter The Amount For Each bet And Win: ");
		   Bet_Amount = Util.scanner.nextInt();
		   betTrials(sTake,bet,goalTarget);
	  }
	  public static void betTrials(double sTake2,double bet2,double goalTarget2)
	  {
		   
		   int win = 0;
		   double winPerc=0,lossPerc=0;
	        for(int i = 0;i < bet2;i++)
	        {
	        	double cash = 100;
	            while (cash > 0 && cash < goalTarget2)
	            {
	          
	                if(Math.random() > 0.5)
	                	cash = cash + Bet_Amount;
	                else
	                	cash = cash - Bet_Amount;
	            }
	            if(cash == goalTarget2)
	                win++;
	        }
			//PRINTING OUTPUT
	     System.out.println("Congrats!! You Won: " + win+" Times Out of "+bet2);
	   	 winPerc = ((win/bet2)*100);
	     System.out.println("Percentage of win is: " + winPerc);
	   	 lossPerc = (100-winPerc);
	     System.out.println("Percentage of loss is: " +lossPerc);
	   }
	}
