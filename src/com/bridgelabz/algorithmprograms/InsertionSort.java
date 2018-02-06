package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Util;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.print("Enter String:");
		String string;
		string = Util.scanner.nextLine().toLowerCase();
		String[] inputArray = string.split(" ");
		
		Util.insertionSortString(inputArray);
	}
	
}