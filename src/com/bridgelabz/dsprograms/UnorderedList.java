package com.bridgelabz.dsprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Util;

public class UnorderedList 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
		String str,st,fileContent[] = null;
		
		BufferedReader bfr=new BufferedReader(new FileReader("/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/bridgelabz/dsprograms/File.txt"));
        try 
        {
			str=((bfr.readLine()).toLowerCase());
			fileContent=str.split(" ");
		} 
        catch (IOException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Enter A String To Find: ");
        st = Util.scanner.next();
        Util.unorderedList(fileContent,st);

	}

	

}
