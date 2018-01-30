package com.bridgelabz.functionalprograms;

public class PowerOfTwo 
{
	static int N;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		N = Integer.parseInt(args[0]);
		int i;
		if(N<=31)
		{
			System.out.println("2's Powers Upto 2^"+N+":");
			for(i = 0;i<=N;i++)
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
