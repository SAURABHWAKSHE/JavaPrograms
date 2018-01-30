package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Util;;

public class SquareRoot
{
	public static void main(String[] args) 
	{
	    double c;
        Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a Number:");
		c=sc.nextDouble();
		System.out.println("sqrt="+Util.sqrt(c));
		
	}
}