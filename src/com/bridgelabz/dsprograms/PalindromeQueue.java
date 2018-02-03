package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Util;

public class PalindromeQueue 
{
	public static void main(String[]arg)
	{
		System.out.println("Enter a String:");
		String string = Util.scanner.nextLine().toLowerCase();
		Util.isPalindrome(string);
	}
}
