package com.bridgelabz.functionalprograms;


public class Distance 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int xparam,yparam;
		double distance;
		xparam = Integer.parseInt(args[0]);
		yparam = Integer.parseInt(args[1]);
		distance= Math.sqrt(xparam*xparam+yparam*yparam);
		System.out.println("Euclidean Distance = "+distance+" units.");
	}

}

