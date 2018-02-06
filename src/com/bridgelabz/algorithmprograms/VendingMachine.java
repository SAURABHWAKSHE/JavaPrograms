package com.bridgelabz.algorithmprograms;
import com.bridgelabz.utility.Util;

public class VendingMachine 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter The Amount That You Want To WithDraw:");
		int WithDraw ;
		int withDraw = Util.scanner.nextInt();
		toChange(withDraw);
	}
	public static void toChange(int aMount)
	{
		int i,count=0; 
		int [] nNotes = {1,2,5,10,50,100,500,1000};
		try 
		{
			while(aMount>0)
			{
				for(i=nNotes.length-1;i>0;i--)
				{	
					
					if(aMount>=nNotes[i])
					{	
						aMount = aMount -nNotes[i];
						count++;
						System.out.println(nNotes[i]);
						break;
					}
			
				}
			}
		System.out.println(count+" needed to give change from Vending Machine");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}