package com.bridgelabz.functionalprograms;

import com.bridgelabz.utility.Util;

public class Quadratic
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter The value For a,b and c:");
		int paramA,paramB,paramC;
		paramA = Util.scanner.nextInt();
		paramB = Util.scanner.nextInt();
		paramC = Util.scanner.nextInt();
		double root1,root2,delta;
		
		System.out.println("Given Eq. Is: "+paramA+"*x^2+"+paramB+"*x+"+paramC);
		delta = paramB*paramB-4*paramA*paramC;
		System.out.println("DElta:"+delta);
		if(delta>0)
		{
			System.out.println(" Roots are real and unequal");
			root1=(-paramB+Math.sqrt(delta)/2*paramA);
			root2=(-paramB-Math.sqrt(delta)/2*paramA);

			System.out.println(" First root is : " +root1);
			System.out.println(" Second root is : " +root2);
		}
		else if (delta==0) 
		{
			System.out.println("Roots are real and equal");
			root1=(-paramB+Math.sqrt(delta)/2*paramA);
			
			System.out.println("Root =" + root1);
		}
		else
		{
			System.out.println("Roots are Imaginary");
		}

	}

}
