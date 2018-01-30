package com.bridgelabz.algorithmprograms;



import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Array Size:");
		int i,arrSize=0;
		arrSize = sc.nextInt();
		String[] str = new String[arrSize];
		System.out.println("Enter The Array Elements:");
		for(i=0;i<arrSize;i++)
		{
			str[i] = sc.next().toLowerCase();
		}
		insSortArray(str);
	}
	public static void insSortArray(String[] string)
	{
		int i,j;
		for(j=1;j<string.length;j++)
		{
			i = j-1;  
			while(i>=0)
			{
				if(string[j].compareTo(string[i])<0)
				{
					String str;
					str = string[j];
					string[j] = string[i];
					string[i] = str;
				}
				i--;
			}
			
		}
		
		for(i=0;i<string.length;i++)
		{
		System.out.print(string[i]+" ");
		}
	}
}