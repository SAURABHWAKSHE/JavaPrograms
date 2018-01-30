package com.bridgelabz.functionalprograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray 
{
	static int Number_Rows,Number_Cols;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Scanner class Declaration and Accepting Array Size
		 */
		Scanner in = new Scanner(System.in);
		PrintWriter print = new PrintWriter(new OutputStreamWriter(System.out));
		print.write("Enter The Size Of The Array:");
		print.flush();
		Number_Rows = in.nextInt();
		Number_Cols = in.nextInt();
		int choice, i, j; 

		/*
		 * Declaration Of Array 
		 */
		int [][] intArray = new int [Number_Rows][Number_Cols];
		double [][] douArray = new double [Number_Rows][Number_Cols];
		boolean [][] bolArray = new boolean [Number_Rows][Number_Cols];
		print.write("Enter Your Choice of Array");
		print.flush();
		choice = in.nextInt();
		/*
		 * 
		 */
		switch(choice)
		{
			case 1 :print.write("You have opted for Integer Array.now Accept Array Elements:");
					print.flush();
					for(i=0;i<Number_Rows;i++)
					{
						for(j=0;j<Number_Cols;j++)
						{
							intArray[i][j] = in.nextInt();
						}
					}
					print.println("Printing Array On Std.Output:");
					print.flush();
					for(i=0;i<Number_Rows;i++)
					{
						for(j=0;j<Number_Cols;j++)
						{
							int el = intArray[i][j];
							print.write(String.valueOf(el)+" ");
							//System.out.println(intArray[i][j]);
							print.flush();
							
						}
						print.println();
						print.flush();
					}
					break;
			case 2 :print.write("You have opted for Double Array.now Accept Array Elements:");
			      	print.flush();
					for(i=0;i<Number_Rows;i++)
					{
						for(j=0;j<Number_Cols;j++)
						{
							douArray[i][j] = in.nextDouble();
						}
					}
					print.println("Printing Array On Std.Output:");
					//print.println();
					print.flush();
					for(i=0;i<Number_Rows;i++)
					{
						for(j=0;j<Number_Cols;j++)
						{
							print.print(douArray[i][j]+" ");
							print.flush();
							
						}
						print.println();
						print.flush();
					}
					break;
			case 3 :print.write("You have opted for boolean Array.now Accept Array Elements:");
					print.flush();
					for(i=0;i<Number_Rows;i++)
					{
						for(j=0;j<Number_Cols;j++)
						{
							bolArray[i][j] = in.nextBoolean();
						}
					}
					print.println("Printing Array On Std.Output:");
					print.flush();
					for(i=0;i<Number_Rows;i++)
					{
						for(j=0;j<Number_Cols;j++)
						{
							print.print(bolArray[i][j]+" ");
							print.flush();
							
						}
						print.println();
						print.flush();
					}
					break;
			default :print.write("Invalid Choice");
					 print.flush();
					 print.close();
		}

	}

}
