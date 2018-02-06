package com.bridgelabz.functionalprograms;

public class WindChill
{
    public static void main(String[] args)
    {
	    double temperature,velocity,effectiveTemp=0;    
	    temperature=Integer.parseInt(args[0]);
	    velocity=Integer.parseInt(args[1]);
        //Effective Temperature calculation
        if(temperature<=50 && velocity>3 && velocity<=120)
        {
        	effectiveTemp=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(velocity,0.16);
        }
            System.out.println("Effective Temperature:"+effectiveTemp+" Degrees");	
    }
}