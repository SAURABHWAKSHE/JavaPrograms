package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class Permutation
{
	
	   public static void main(String args[]) 
	   {	
		   System.out.println("Enter string: ");
		   String permutstring = Util.scanner.next();
		  
		   System.out.println("The permuted strings are: ");
		   permute(permutstring, 0,permutstring.length()-1);
	   }

	   public static void permute(String permutstring, int l, int r)
	    {
	        if (l == r)
	        {
	            System.out.println("l==r :");
	            System.out.println(permutstring);
	        }
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                System.out.println("Before swap :"+permutstring);    
	                permutstring = swap(permutstring,l,i);
	                System.out.println("After swap :"+permutstring);
	                permute(permutstring, l+1, r);
	                
	            }
	        }
	    }
	   public static String swap(String a, int i, int j)
	   {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	   }

}
		  
	  

