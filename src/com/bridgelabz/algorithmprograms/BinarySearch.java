package com.bridgelabz.algorithmprograms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


import com.bridgelabz.utility.Util;

public class BinarySearch 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		String string,string1,city[];
		BufferedReader bfr=new BufferedReader(new FileReader("/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/"
				+ "bridgelabz/algorithmprograms/Cities.txt"));
        string=((bfr.readLine()).toLowerCase());
        city=string.split(" ");
		System.out.println("Enter a String That You Have to Search.");
		string1= (Util.scanner.next().toLowerCase());
        if(Util.binarySearchString(city,string1))
        	System.out.println("given word found in string array read from file");
        else
        	System.out.println("given word Not found in string array read from file");
	}
}
