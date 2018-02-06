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
		findNum(startPoint,endPoint);
		System.out.println("Guess a Num Between "+startPoint+" and "+endPoint);
	}
	public static void findNum(int start,int end)
	{
		int mid=(start+end)/2;

		if(start==mid)
			System.out.println("is "+mid+" your Number");
		else
			System.out.println("Is your Number present  between "+start+" to mid="+mid+" ?");
		try {
			if(start==end)
			{
				System.out.println("I Think "+mid+" is your Number");
				System.exit(0);
			}
				
			else if(Util.scanner.nextBoolean()) 
				findNum(start, mid);
			else
				findNum(mid+1, end);
		}
		catch(Exception exception) {
			System.out.println("Exception:"+exception);
		}
	}
}
	

