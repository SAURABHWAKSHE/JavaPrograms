package com.bridgelabz.dsprograms;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.bridgelabz.utility.Util;

public class UnorderedList 
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
			Util.unorderedList("/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/bridgelabz/dsprograms/Unorder.txt");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
