package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class BinarySwap 
{
	
	public static void main(String[] args)
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
		System.out.println();
		int [] sWapped = Util.swapNibbles(binary,size);
		System.out.println("Binary Num After NibbSwap:");
		for(int i=0;i<sWapped.length;i++)
		{
			System.out.print(sWapped[i]);
		}
		System.out.println();
		System.out.println("Is Swapped Num Power Of Two:");
		System.out.println(Util.toDecimal(binary,size));
		
	}
	
	
}
