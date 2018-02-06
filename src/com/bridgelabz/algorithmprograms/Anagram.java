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
		/*static void isAnagram(String str,String str1)
		{
			String s1 = str.replace("\\s","");
			String s2 = str1.replace("\\s","");
			int x,y;
			x = s1.length();
			y = s2.length();
			if(x!=y)
				status = false;
			else
			{
				char[]arr = s1.toCharArray();
				char[]arr1 = s2.toCharArray();
				Arrays.sort(arr);
				Arrays.sort(arr1);
				status = Arrays.equals(arr,arr1);
			}
				
			if(status)
				System.out.print("The Strings are Anagram");
			else
				System.out.print("The Strings are not Anagram");
				
		}*/

