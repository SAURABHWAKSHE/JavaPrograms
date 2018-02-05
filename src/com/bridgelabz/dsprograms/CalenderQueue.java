package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Util;

public class CalenderQueue 
{
	 public static void main(String[] args) 
	 {
	      int month = Integer.parseInt(args[0]);    
	      int year = Integer.parseInt(args[1]);     
	      Util.dispQueueCalender(month,year);
	 }
}
