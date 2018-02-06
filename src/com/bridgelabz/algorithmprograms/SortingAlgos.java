package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Util;

public class SortingAlgos 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter String:");
 		String userInput = Util.scanner.nextLine().toLowerCase();
 		String [] sTring = userInput.split("\\s");
		System.out.println("Enter The Size Of int Array:");
		int i,length=0;
		length = Util.scanner.nextInt();
		int [] iNteger = new int[length];
		System.out.println("Enter Integer Array Elements: ");
		for(i=0;i<length;i++)
		{
			iNteger [i]= Util.scanner.nextInt();
		}
		Util.callAlgos(sTring,iNteger);
	}
}
