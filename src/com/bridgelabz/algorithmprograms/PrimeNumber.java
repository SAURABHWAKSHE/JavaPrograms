package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Util;

public class PrimeNumber
{
    public static void main(String args[])
    {
         int low, high,i,j,yCount=0;
         System.out.println ("Enter the lower Number :"); 
         low = Util.scanner.nextInt();
         System.out.println ("Enter the higher Number :"); 
         high = Util.scanner.nextInt();
         int prime[] =Util.checkPrime(low,high);
         int dupPrime[] = new int[prime.length];
    	 for(i=0;i<prime.length;i++)
         {
    		 dupPrime[i]=prime[i];
         }
         for(i=0;i<prime.length;i++)
         {
        	 System.out.print(prime[i]+" ");
         }
         System.out.println();
         for(i=0;i<prime.length;i++)
         {
        	 String temp = Integer.toString(prime[i]);
        	
        	 if(Util.isPalin(temp))
        	 {
        		 yCount++;
        		 System.out.print(prime[i]+" ");
        	 }
         }
         System.out.println();
         System.out.println("Total "+yCount+" Prime PalinDrome Numbers are there in between "+low+" And "+high);
         /*
          * Anagram 
          */
         System.out.println("Prime Anagrams Are:");
         for(i=0;i<prime.length;i++)
         {
        	 for(j=i+1;j<prime.length;j++)
             {
        		 String str = Integer.toString(prime[i]);
        		 String str1 = Integer.toString(dupPrime[j]);
        		
        			 if(Util.isAnagram(str,str1))
        			 {
        				 System.out.print(str+"  "+str1+" ");
        				 
        			 }
        			 	 
        	  }
        		
         }
    }
}

              
             
         
             
         
       


	  


