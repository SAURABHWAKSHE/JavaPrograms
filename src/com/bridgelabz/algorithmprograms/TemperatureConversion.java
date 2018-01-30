package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Util;

public class TemperatureConversion
{
	static double celTemp,tempFah;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp.in Celcius: ");
		celTemp = sc.nextDouble();
		System.out.println("Enter Temp.in fahrenheit: ");
		tempFah = sc.nextDouble();
		double F = Util.celToFah(celTemp);
		System.out.println("celToFah: "+celTemp+" celcius = "+F+" fahrenheit");
		double C = Util.fahToCal(tempFah);
		System.out.println("celToFah: "+tempFah+" fahrenheit = "+C+" celcius");
	}
	
}
