package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Util;

public class Anagram 
{
	public static void main(String[]arg)
	{
		System.out.print("Enter The First Strings:");
		String string,string1,newString,newString1;
		string = (Util.scanner.nextLine().toLowerCase());
		newString = string.replaceAll("\\s", "");
		System.out.print("Enter The Second Strings:");
		string1 = (Util.scanner.nextLine().toLowerCase());
		newString1 = string1.replaceAll("\\s", "");
		//System.out.println("Final String Are:"+newStr+" And "+newStr1);
		
		if(Util.isAnagram(newString,newString1))
			System.out.print("Result:The Strings are Anagram");
		else
			System.out.print("Result:The Strings are Not Anagram");
	}
}