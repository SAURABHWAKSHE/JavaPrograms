package com.bridgelabz.functionalprograms;


public class Distance 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x,y;
		double d;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		d= Math.sqrt(x*x+y*y);
		System.out.println("Euclidean Distance = "+d+" units.");
	}

}

