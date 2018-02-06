package com.bridgelabz.algorithmprograms;


import com.bridgelabz.utility.Util;

public class TemperatureConversion
{
	static double Celcius_Temp,Fah_Temp;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.out.println("Enter Temp.in Celcius: ");
		Celcius_Temp = Util.scanner.nextDouble();
		System.out.println("Enter Temp.in fahrenheit: ");
		Fah_Temp = Util.scanner.nextDouble();
		double fahrehneit = Util.celToFah(Celcius_Temp);
		System.out.println("celToFah: "+Celcius_Temp+" celcius = "+fahrehneit+" fahrenheit");
		double celcius = Util.fahToCal(Fah_Temp);
		System.out.println("celToFah: "+Fah_Temp+" fahrenheit = "+celcius+" celcius");
	}
	
}
