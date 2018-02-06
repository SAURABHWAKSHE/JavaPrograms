package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class StringTemplate 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		String ipstring = "Hello <<username>>,How are you?";
		System.out.println(ipstring);
		System.out.print("Which word do you want to replace from String:");
		String toreplace= Util.scanner.next();
		System.out.println();
		System.out.print("What do you want to replace with that word:");
		String byreplace = Util.scanner.next();
		System.out.println();
		if(byreplace.length()>3)
		{
			ipstring = ipstring.replace(toreplace,byreplace);
			System.out.println(ipstring);
		}
		else
		{
			System.out.println("Username must have atleast 3 characters.");
			System.exit(0);
		}
	}

}

