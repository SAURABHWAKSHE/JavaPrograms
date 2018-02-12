package com.bridgelabz.oopsprograms;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Util;

public class StockReport 
{
	public static void main(String[]arg) throws ParseException
	{
		System.out.println("Which operation Do You Want To Perform?\n1.Read\n2.Write");	
		int operation = Util.scanner.nextInt();
		switch(operation)
		{
		case 1 : String fileName = "/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/bridgelabz/oopsprograms/StockReport.json";
			try 
			{
				Util.readFromStockReport(fileName);
			} 
			catch (FileNotFoundException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2 : try 
			{
				Util.writeToStockReport();
			} 
			catch (IOException e)	
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    break;
	    default :System.out.println("Invalid");
		}		
	}
}
