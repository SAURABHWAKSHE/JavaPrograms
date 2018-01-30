package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Util;; 
public class Binary
{
	
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n,size;
		System.out.println("Enetr a Decimal Number:");
		n=s.nextInt();
		System.out.println("Enetr a size:");
		size=s.nextInt();
		int[]binary = Util.toBinary(n,size);
		System.out.println(size/8+ " byte representation");
		for(int j=size-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		
		}
	}
	
}