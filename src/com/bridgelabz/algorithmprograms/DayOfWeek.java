package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Util;;

public class DayOfWeek  
{
	static int dDay,mMonth,yYear;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Enter Day,Month And Year: ");
		dDay   = Integer.parseInt(args[0]);
		mMonth = Integer.parseInt(args[1]);
		yYear  = Integer.parseInt(args[2]);
		int res = Util.weekDay(dDay,mMonth,yYear);
		switch(res)
		{
			case 0: System.out.println("On "+dDay+"/"+mMonth+"/"+yYear+" There is Sunday.");
					break;
			case 1: System.out.println("On "+dDay+"/"+mMonth+"/"+yYear+" There is Monday.");
					break;
			case 2: System.out.println("On "+dDay+"/"+mMonth+"/"+yYear+" There is Tuesday.");
					break;
			case 3: System.out.println("On "+dDay+"/"+mMonth+"/"+yYear+" There is Wednesday.");
					break;
			case 4: System.out.println("On "+dDay+"/"+mMonth+"/"+yYear+" There is Thursday.");
					break;
			case 5: System.out.println("On "+dDay+"/"+mMonth+"/"+yYear+" There is Friday.");
					break;
			case 6: System.out.println("On "+dDay+"/"+mMonth+"/"+yYear+" There is Satday.");
					break;
			
		}
	}
}	

