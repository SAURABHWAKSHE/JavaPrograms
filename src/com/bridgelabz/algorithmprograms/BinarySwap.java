package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Util;

public class BinarySwap 
{
	public static void main(String[] args)
	{
	
		int decimal,size;
		System.out.println("Enetr a Decimal Number:");
		decimal=Util.scanner.nextInt();
		System.out.println("Enetr a size:");
		size=Util.scanner.nextInt();
		int[]binary = Util.toBinary(decimal,size);
		System.out.println(size/8+ " byte representation");
		for(int j=size-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		
		}
		System.out.println();
		int [] sWapped = Util.swapNibbles(binary,size);
		System.out.println("Binary Num After NibbSwap:");
		for(int i=sWapped.length-1;i>=0;i--)
		{
			System.out.print(sWapped[i]);
		}
		System.out.println();
		System.out.println("Is Swapped Num Power Of Two:");
		System.out.println(Util.toDecimal(binary,size));
		
	}
	
	
}
