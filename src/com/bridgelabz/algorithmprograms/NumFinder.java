package com.bridgelabz.algorithmprograms;


import java.util.Scanner;
public class NumFinder 
{
	static Scanner sc;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int N,n;
		n = sc.nextInt();
		N = (int) Math.pow(2,n);
		int start=0,end=N-1;
		findNum(start,end);
		System.out.println("Guess a Num Between "+start+" and "+end);
	}
	public static void findNum(int start,int end) {
		
		int mid=(start+end)/2;
		
		Scanner scanner=new Scanner(System.in);
		
		
		if(start==mid)
			System.out.println("is "+mid+" your Number");
		else
			System.out.println("Is your Number present  between "+start+" to mid="+mid+" ?");
		try {
			if(start==end)
			{
				System.out.println("I Think "+mid+" is your Number");
				System.exit(0);
			}
				
			else if(scanner.nextBoolean()) 
				findNum(start, mid);
			else
				findNum(mid+1, end);
		}
		catch(Exception exception) {
			System.out.println("Exception:"+exception);
		}
		
	}
}

