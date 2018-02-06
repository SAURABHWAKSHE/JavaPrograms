package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Util;; 
public class Binary
{
	public static void main(String arg[])
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
	}
	
}