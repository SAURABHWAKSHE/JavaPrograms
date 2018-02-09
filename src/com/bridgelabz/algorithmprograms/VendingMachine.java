package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Util;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter The Amount That You Want To WithDraw:");
		int WithDraw ;
		int withDraw = Util.scanner.nextInt();
		Util.toChange(withDraw);
	}
}