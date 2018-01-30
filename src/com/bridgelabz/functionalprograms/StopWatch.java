package com.bridgelabz.functionalprograms;


class StopWatch 
{
	private static long start,eTime,end;
	public static void elapsedTime()
	{
		int i,itr=100000;
		for(i=1;i<=itr;i++)
		{
		StopWatch s = new StopWatch();
		}
		end = System.currentTimeMillis();
		System.out.println("End time:"+end+" milliseconds");
		eTime = (end - start);
		System.out.println("elapse time:"+eTime+" milliseconds");
	}
	public static void main(String args[])
	{
		
		start = System.currentTimeMillis();
		System.out.println("start time:"+start+" milliseconds");
		elapsedTime();
	}
} 
