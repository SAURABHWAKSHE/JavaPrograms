package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class PrimeFactor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter The Number:");
		int number,i;
		number = Util.scanner.nextInt();
		System.out.println("Prime Factors Are:");
		Util.primeFactor(number);
	}

}
/*if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
System.out.print("*"+i);
else if(i == 2 || i == 3 || i == 5 || i==7)
System.out.print(i+"*");
else
continue;
*/