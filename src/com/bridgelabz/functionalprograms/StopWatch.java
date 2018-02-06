package com.bridgelabz.functionalprograms;
public class StopWatch 
{
	private static long Start_Time,End_Time,Elapsed_Time;
	public static void elapsedTime()
	{
		int i,itrate=100000;
		for(i=1;i<=itrate;i++)
		{
		StopWatch s = new StopWatch();
		}
		End_Time = System.currentTimeMillis();
		System.out.println("End time:"+End_Time+" milliseconds");
		Elapsed_Time = (End_Time - Start_Time);
		System.out.println("elapse time:"+Elapsed_Time+" milliseconds");
	}
	public static void main(String args[])
	{
		Start_Time = System.currentTimeMillis();
		System.out.println("start time:"+Start_Time+" milliseconds");
		elapsedTime();
	}
} 
