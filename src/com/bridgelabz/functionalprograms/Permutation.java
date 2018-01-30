package com.bridgelabz.functionalprograms;

import java.util.Scanner;


public class Permutation
{
	
	   public static void main(String args[]) 
	   {	
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter string: ");
		   String str = sc.next();
		  
		   System.out.println("The permuted strings are: ");
		   permute(str, 0,str.length()-1);

		   sc.close();
	   }

	   public static void permute(String str, int l, int r)
	    {
	        if (l == r)
	        {
	            System.out.println("l==r :");
	            System.out.println(str);
	        }
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                System.out.println("Before swap :"+str);    
	                str = swap(str,l,i);
	                System.out.println("After swap :"+str);
	                permute(str, l+1, r);
	                
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
		  
	  

