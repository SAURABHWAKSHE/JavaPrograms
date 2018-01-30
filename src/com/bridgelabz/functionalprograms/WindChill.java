package com.bridgelabz.functionalprograms;


public class WindChill
{
	
    public static void main(String[] args)
    {
	    double t,v,w=0;    
    	t=Integer.parseInt(args[0]);
        v=Integer.parseInt(args[1]);
        //Effective Temperature calculation
        if(t<=50 && v>3 && v<=120)
        {
        	w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
        }
            System.out.println("Effective Temperature:"+w+" Degrees");	
    }
}