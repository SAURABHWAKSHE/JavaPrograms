package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class PrimeFactor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num,i;
		num = sc.nextInt();
		System.out.println("Prime Factors Are:");
		while(num%2==0)
		{
			System.out.print(2+" ");
			num/=2;
		}
		for(i=3;i<=Math.sqrt(num);i=i+2)
		{
			if(num%i == 0)
			{
				System.out.print(i+" ");
				num/=i;
			}
		}
		if(num>2)
			System.out.print(num);
	}

}
/*if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
System.out.print("*"+i);
else if(i == 2 || i == 3 || i == 5 || i==7)
System.out.print(i+"*");
else
continue;
*/