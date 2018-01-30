package com.bridgelabz.functionalprograms;


import java.util.Scanner;

public class Triplets  
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The Value Of N:");
		n = sc.nextInt();
		int i,sum=0,j,k;
		int count = 0;
		int arr[] = new int[n];
		System.out.println("Enter Array ELements:");
		for(i=0 ;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Distinct Triplets:");
		for(i=0 ;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1 ;k<n;k++)
				{
					sum = arr[i]+arr[j]+arr[k];
					if(sum==0)
					{
						System.out.println("("+i+","+j+","+k+")");
						count++;
					}
				}
			}
		
		}
		System.out.println("Number Of Distinct Triplets:"+count);

	}

}
