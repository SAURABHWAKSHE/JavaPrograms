package com.bridgelabz.functionalprograms;
import java.util.Scanner;
public class StringTemplate 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = "Hello <<username>>,How are you?";
		System.out.println(str);
		System.out.print("Which word do you want to replace from String:");
		String st1 = scanner.next();
		System.out.println();
		System.out.print("What do you want to replace with that word:");
		String st2 = scanner.next();
		System.out.println();
		if(st2.length()>3)
		{
			str = str.replace(st1, st2);
			System.out.println(str);
		}
		else
		{
			System.out.println("Username must have atleast 3 characters.");
			System.exit(0);
		}
	}

}

