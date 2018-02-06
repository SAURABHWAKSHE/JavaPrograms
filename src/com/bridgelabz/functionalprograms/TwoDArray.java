package com.bridgelabz.functionalprograms;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import com.bridgelabz.utility.Util;

public class TwoDArray 
{
	static int Number_Rows,Number_Cols;
	public static <T> void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintWriter print = new PrintWriter(new OutputStreamWriter(System.out));
		print.write("Enter The Size Of The Array:");
		print.flush();
		Number_Rows = Util.scanner.nextInt();
		Number_Cols = Util.scanner.nextInt();
		int i, j; 
		Util.arrays(Number_Rows,Number_Cols);
		
	}

}
