package com.bridgelabz.oopsprograms;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Util;

public class Inventory 
{
	public static void main(String[]arg) throws IOException
	{
		char character =' ';
		do
		{
			System.out.println("Which operation Do You Want To Perform?\n1.Read\n2.Write");	
			int operation = Util.scanner.nextInt();
			switch(operation)
			{
				case 1 : String fileName = "/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/bridgelabz/oopsprograms/Inventory.json";
						 try 
						 {
							Util.readFromInventory(fileName);
						 }
						 catch (ParseException e) 
						 {
								// TODO Auto-generated catch block
								e.printStackTrace();
						 }
						 break;
				case 2 : Util.writeToJson();
					     break;
				default :System.out.println("Invalid");
			}
			System.out.println("Do You Want To Continue:(Y/N)");
			character = Util.scanner.next().charAt(0);
		}while(character == 'Y'||character =='y');
	}
}
