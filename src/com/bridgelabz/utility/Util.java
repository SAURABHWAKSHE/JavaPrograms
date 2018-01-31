package com.bridgelabz.utility;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Util
{
	public static Scanner scanner = new Scanner(System.in);
	static String [] sTring,str ;
	static int k=0;
	static double startTime;
	static double endTime;
	static double elapsedTime=0;
	static double eTime[] = new double[6];
	static LinkedList <String> linkedlist= new LinkedList<String>(); 
	static LinkedList <Integer> lntegerlist= new LinkedList<Integer>(); 
	/*
	 * function to find a year is leapyear or not
	 */
	public static boolean LeapYear(int year)
	{
		if(year%400 == 0)
			return true;
		if(year%100 == 0)
			return false;
		if(year%4 == 0)
			return true;
		return false;
		
	}
	/*
	 * returns weekDay that falls on given date for the Gregorian calendar
	 */
	public static int weekDay(int d,int m,int y)
	{
		int y1=0,x,m1,d1;
		y1 = y - (14 - m) / 12;
		x = y1 + y1/4 -y1/100 + y1/400;
		m1 = m + 12 * ((14 - m) / 12) - 2;
		d1 = (d+ x + 31*m1 / 12) % 7;
		return d1;
		
	}
	/*
	 * Returns The Sq. Root Of The Given Num Using Newton's Method.  
	 */
	public static double sqrt(double c)
    {
        double epsilon=1e-15;
        double t=c;
        t=(c/t+t)/2;
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        return t;
    }
	/*
	 * Returns The 4 byte representation Of Decimal Number
	 */
	public static int[] toBinary(int n,int size)
	{
		int i=0,b=0;
		int binary[]=new int[size];
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}
		/*
		*4 byte representation
		*/
		for(i=binary.length;i<size;i++)
		{
			binary[i]=b;
		}
		/*
		*displaying final binary no.
		*/
		return binary;
	}
	/*
	 * Returns The Amount That You have to pay as Installment
	 */
	public static double monthlyPayment(int loanAmount,int yYear,double rate)
	{
		double r;
		int n = 12 *yYear;
		r = rate/(12*100);
		return (loanAmount*r)/(1-(Math.pow((1+r), -n)));
	}
	/*
	 * performs insertion sort and returns the sorted array.
	 */
	public static String[] insSortArray(String[] string)
	{
		int i,j;
		
		for(j=1;j<=string.length;j++)
		{
			i = j--;  
			while(i>=0)
			{
				if(string[j].compareTo(string[i])<0)
				{
					String str;
					str = string[j];
					string[j] = string[i];
					string[i] = str;
				}
				i--;
			}
			
		}
		
		return string;
	}
		

	/*
	 * reading a file and accepting a word from user and checking whether
	 *  that word exists in that file or not using Binary Search Algorithm
	 */
	public static boolean binarySearch(String [] city,String key)
	{
		int i,j;
		int len = city.length; 
		for(i=0;i<city.length;i++)
		{
			for(j=i+1;j<city.length;j++)
			{
				if(city[i].compareTo(city[j])>0)
				{
					String str;
					str = city[i];
					city[i] = city[j];
					city[j] = str;
				}
			}
		}
		for(i=0;i<len ;i++)
		{
			System.out.print(city[i]+" ");
		}
		System.out.println();
		int mid = len/2,start = 0,end = len-1;
		for(i=0;i<len ;i++)
		{
			int num;
			num=key.compareTo(city[mid]);
			if(num==0)
			{	
				return true;
				
			}
			else if (num<0)
			{
				end = mid--; 
				mid = (start+end)/2;
			}		
			else
			{
				start = mid++;
				mid = (start+end)/2;
			}
		}

		return false; 
		
	}
	/*
	 * static function to check Strings are anagram or not.
	 *  
	 */
	public static boolean isAnagram(String str,String str1)
	{
		/*int x,y,i,j,cnt=0,rpt=0;
		x = str.length();
		y = str1.length();
		if(x == y)
		{
			int z=0;
			for(i=0;i<x;i++)
			{
				
				for(j=0;j<x;j++)
				{
					if(str.charAt(i)==str1.charAt(j))
					{
						
						if(z<=j && str.charAt(z) == str1.charAt(++z))
						{
							rpt++;
						}
							
						cnt++;
					}
					
				}
			}
			if((cnt-(rpt*2))==x)
				return true;
			
		}
		return false;
	}*/
		String s1 = str.replace("\\s","");
		String s2 = str1.replace("\\s","");
		boolean status = false;
		int x,y;
		x = s1.length();
		y = s2.length();
		if(x!=y)
			status = false;
		else
		{
			char[]arr = s1.toCharArray();
			char[]arr1 = s2.toCharArray();
			Arrays.sort(arr);
			Arrays.sort(arr1);
			status = Arrays.equals(arr,arr1);
			return status;
		}
		return status;
			
		
	}
	/*
	 * Bubble Sort of Integers.
	 */
	public static int[] bubbleSort(int [] aArr,int n)
	{
		/*
		 * Bubble Sort
		 */
		int i,j;
		System.out.println("Array Elements:");
		for(i = 0;i<n;i++)
		{
			System.out.print(aArr[i]+" ");
		}
		System.out.println();
		for(i = 0;i<n;i++)
		{
			for(j = i+1;j<n;j++)
			{
				if(aArr[i]>aArr[j])
				{	
					int temp;
					temp = aArr[i];
					aArr[i] = aArr[j];
					aArr[j] = temp;
				}
			}

		}
		return aArr;
	}
	/*
	 * it is swapping the upper and lower nibbles of a binary array
	 */
	public static int[] swapNibbles(int bin[],int size)
	{
		int i,j,temp;
		for(i=0,j=size/2;i<size/2;i++,j++)
		{
			temp = bin[i];
			bin[i] = bin[j];
			bin[j] = temp;
		}
		return bin;
	}
	/*
	 * it is to find decimal equivalent number of binary
	 */
	public static boolean toDecimal(int bin[],int size)
	{
		int i,decNum=0;
		for(i=0;i<size;i++)
		{
			if(bin[i] == 1)
			decNum += Math.pow(2,i);
		}
		System.out.println();
		System.out.println("Swapped Number = "+decNum);
		
		
		if(decNum == 1 ||decNum == 2 ||decNum == 4 ||decNum == 8 ||decNum == 16 ||decNum == 32 ||decNum == 64 ||decNum == 128)
			return true;
			//System.out.println("Resultant Number "+decNum+" is Power Of 2");
		else
			return false;
			//System.out.println("Resultant Number "+decNum+" is NOT Power Of 2");
	}
	/*
	 * it is showing the number is palindrome or not
	 */
	 public static boolean isPalin(String num)
	    {
	    	int i,j;
	    	
	    	int len = num.length();
	    	int [] numArray = new int[len];
	    	int [] revArray = new int[len];
	    	for (i = 0; i < len; i++)
	    	{
	    		numArray[i] = num.charAt(i)-'0' ;
	    	}
	    	for( i = 0,j=len-1; i < len; i++,j--)
	    	{
	    		revArray[j] = numArray[i];
	    	}
	    
			if(Arrays.equals(numArray,revArray))
				return true;
	    	
	    	return false;
	    }
	 /*
	  * Function to find prime number.
	  */
	 public static int[] checkPrime(int low,int high)
	 {
		 int i,j,num=0,k=0;
		 int prime[] = new int[high];
		 for(i=low;i<=high;i++)
    	 {
            int count=0;
                for(j=1;j<=i;j++)
                {
                    if(i%j==0) 
                        count++;
                }
                if(count==2)
                {
                   
                    prime[k]=i;
                    k++;
                    num++;
                }
         }
		 int dupPrime[] = new int[k];
    	 for(i=0;i<k;i++)
         {
    		 dupPrime[i]=prime[i];
         }
		 System.out.println("Total "+num+" Prime Numbers are there in between "+low+" And "+high);
		 return dupPrime;
	 }
	 /*
	  * Function to convert celcius to fahrehneit
	  */
	 public static double celToFah(double celTemp)
	 {
			double F;
			F = (celTemp * 9/5) + 32;
		    return F;

	 }
	 /*
	  * Function to convert fahrehneit to celcius
	  */
	 public static double fahToCal(double tempFah)
	 {
		double C;
		C = (tempFah -32) * 5/9; 
		return C;
	 }
	 public static boolean binarySearchString(String [] city,String key)
		{
			int i,j;
			int len = city.length; 
		
			for(i=0;i<len ;i++)
			{
				System.out.print(city[i]+" ");
			}
			System.out.println();
			int mid = len/2,start = 0,end = len-1;
			for(i=0;i<len ;i++)
			{
				int num;
				num=key.compareTo(city[mid]);
				if(num==0)
				{	
					return true;
					
				}
				else if (num<0)
				{
					end = mid--; 
					mid = (start+end)/2;
				}		
				else
				{
					start = mid++;
					mid = (start+end)/2;
				}
			}

			return false; 
			
		}
			
		/*
		 * Bubble Sort for Integers
		 */

		public static int[] bubbleSortInt(int[] iNteger) 
		{
			// TODO Auto-generated method stub
			for(int i = 0;i<iNteger.length;i++)
			{
				for(int j = i+1;j<iNteger.length;j++)
				{
					if(iNteger[j]<iNteger[i])
					{
						int temp = iNteger[i];
						iNteger[i] = iNteger[j] ;
						iNteger[j] = temp;
					}
				}
			}
			System.out.println("Sorted Array Of BubbleSort:");
			for(int i = 0;i<iNteger.length;i++)
			{
				System.out.print( iNteger[i]+"   ");
			}
			System.out.println();
			return iNteger;
		}
		
		/*
		 * Bubble Sort for Strings
		 */
		public static String[] bubbleSortString(String[] sTring) 
		{
			// TODO Auto-generated method stub
			for(int i = 0;i<sTring.length;i++)
			{
				for(int j = i+1;j<sTring.length;j++)
				{
					if(sTring[j].compareTo(sTring[i])<0)
					{
						String temp = sTring[i];
						sTring[i] = sTring[j] ;
						sTring[j] = temp;
					}
				}
			}
			System.out.println("Sorted Array Of BubbleSort:");
			for(int i = 0;i<sTring.length;i++)
			{
				System.out.print( sTring[i]+"   ");
			}
			System.out.println();	
			return sTring;
		}
		/*
		 * Insertion Sort for Integers
		 */

		public static void insertionSortInt(int[] iNteger) 
		{
			// TODO Auto-generated method stub
			int i,j;
			
			for(j=1;j<iNteger.length;j++)
			{
				i = j-1;  
				while(i>=0)
				{
					if(iNteger[j]<(iNteger[i]))
					{
						String str;
						str = sTring[j];
						sTring[j] = sTring[i];
						sTring[i] = str;
					}
					i--;
				}
				
			}
			System.out.println("Sorted Array Of Insertion Sort:");
			for(i = 0;i<iNteger.length;i++)
			{
				System.out.print( iNteger[i]+"   ");
			}
			System.out.println();
		}
		/*
		 * Insertion Sort for Strings
		 */
		public static void insertionSortString(String[] sTring) 
		{
			// TODO Auto-generated method stub
			int i,j;
			for(j=1;j<sTring.length;j++)
			{
				i = j-1;  
				while(i>=0)
				{
					if(sTring[j].compareTo(sTring[i])<0)
					{
						String str;
						str = sTring[j];
						sTring[j] = sTring[i];
						sTring[i] = str;
					}
					i--;
				}
				
			}
			System.out.println("Sorted Array Of Insertion Sort:");
			for(i = 0;i<sTring.length;i++)
			{
				System.out.print( sTring[i]+"   ");
			}
			System.out.println();
		}
		/*
		 * binary Search for Integers
		 */
		public static boolean binarySearchInt(int[] iNteger,int key) 
		{
			// TODO Auto-generated method stub
			
			int i,j;
			
			int mid = iNteger.length/2,start = 0,end = iNteger.length-1;
			for(i=0;i<iNteger.length ;i++)
			{
				if(key==iNteger[mid])
				{
					return true;
					
				}else if(key<iNteger[mid])
				{
					end = mid-1; 
					mid = (start+end)/2;
				}
				else
				{
					start = mid+1;
					mid = (start+end)/2;
				}
			}

			return false;
		}
		public static void unorderedList(String[] fileContent, String st) 
		{
			// TODO Auto-generated method stub
			int i;
			for(i=0;i<fileContent.length;i++)
			{
				linkedlist.add(fileContent[i]);
			}
			
			if(linkedlist.contains(st))
			{
				System.out.println("String is already there in List.");
				linkedlist.remove(st);
				System.out.println("so removed From List.");
				
			}
			else
			{
				System.out.println("String is not there in List.");
				linkedlist.add(st);
				System.out.println("Added To The List.");
			}
				
			System.out.println("List Content:");
			for(String str:linkedlist)
				System.out.println(str);
		}
		public static void unorderedListInt(String fileContent) 
		{
			// TODO Auto-generated method stub
			int i;
			BufferedReader bfr=new BufferedReader(new FileReader(fileContent));
			String[]content;
			try 
	        {
				String str=((bfr.readLine()).toLowerCase());
				content=str.split(" ");
			} 
	        catch (IOException e) 
	        {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (String number : content) {
				linkedlist.add(Integer.valueOf(number));
			}
			
			
		}
	/*	public static void searchNumber()
		{
			do
			{
				System.out.println("Enter a Num That You Want To Find:");
				int num = Util.scanner.nextInt(); 
				if(linkedlist.contains(num))
				{
					System.out.println("String is already there in List.");
					linkedlist.remove(linkedlist.indexOf(num));
					System.out.println("so removed From List.");
					
				}
				else
				{
					System.out.println("String is not there in List.");
					linkedlist.addAll(num);
					System.out.println("Added To The List.");
				}
					
				System.out.println("List Content:");
				for(String str:linkedlist)
					System.out.println(str);
			}
		}
	*/
		 
			public static void searchNumber() {
				char answer = ' ';
				do {
					System.out.println("Enter the number to be searched..");
					int number = scanner.nextInt();
					if (linkedlist.contains(number)) {
						System.out.println(number + " is found..Trying to delete it..");
						linkedlist.remove(linkedlist.indexOf(number));
					} else {
						System.out.println(number + " is not found..Trying to add it.. ");
						linkedlist.add(sTring);
					}
					Collections.sort(linkedlist);
					System.out.println("Do u wish to continue..type(Y/N)");
					answer = scanner.next().charAt(0);
				} while (answer == 'Y' || answer == 'y');
			}
}
