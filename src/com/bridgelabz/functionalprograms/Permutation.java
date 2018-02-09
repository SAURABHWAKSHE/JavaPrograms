package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class Permutation
{
	
	   public static void main(String args[]) 
	   {	
		   System.out.println("Enter string: ");
		   String permutstring = Util.scanner.next();
		  
		   System.out.println("The permuted strings are: ");
		   Util.permute(permutstring, 0,permutstring.length()-1);
	   }


}
		  
	  

