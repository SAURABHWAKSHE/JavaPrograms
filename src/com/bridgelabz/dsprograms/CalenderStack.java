package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Util;

public class CalenderStack
{

	 public static void main(String[] args) throws InterruptedException 
	 {
		 System.out.println("Enter Month:");
	     int month = Util.scanner.nextInt();
	     System.out.println("Enter Year:");
	     int year = Util.scanner.nextInt();     
	     Util.stackCalender(month,year);
	 }
	
}