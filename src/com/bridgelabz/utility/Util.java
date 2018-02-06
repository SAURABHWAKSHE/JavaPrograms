package com.bridgelabz.utility;

import com.bridgelabz.utility.LinkedList;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Util
{
	public static Scanner scanner = new Scanner(System.in);
	static String [] sTring ;
	String str;
	static int k=0;
	static double startTime;
	static double endTime;
	static double elapsedTime=0;
	static double eTime[] = new double[6];
	static LinkedList <String> list= new LinkedList<String>(); 
	static LinkedList <Integer> integerList= new LinkedList<Integer>(); 
	static HashMap <Integer,LinkedList<Integer>> hashMap = new HashMap<Integer,LinkedList<Integer>>(); 
	
	/*
	 * function to find a year is leapyear or not
	 * @param year
	 * @return
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
	 * returns weekDay that falls on given date
	 * @param d
	 * @param m
	 * @param y
	 * @return
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
	 * @param num
	 * @return
	 */
	public static double sqrt(double num)
    {
        double epsilon=1e-15;
        double t=num;
        t=(num/t+t)/2;
        while(Math.abs(t-num/t)>epsilon*t)
        {
            t=(num/t+t)/2;
        }
        return t;
    }
	/*
	 * Returns The byte representation Of Decimal Number
	 * into binary
	 * @param decimal
	 * @param size
	 * @return []
	 */
	public static int[] toBinary(int decimal,int size)
	{
		int i=0,b=0;
		int binary[]=new int[size];
		while(decimal>0)
		{
			binary[i]=decimal%2;
			decimal=decimal/2;
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
	 * it is swapping the upper and lower nibbles of a binary array
	 * @param bin[]
	 * @param size
	 * @return []
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
	 * @param bin
	 * @param size
	 * @return
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
		else
			return false;
	}
	/*
	 * it is showing the number is palindrome or not
	 * @param num
	 * @return
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
	 * Returns The Amount That You have to pay as Installment
	 * @param loanAmount
	 * @param yYear
	 * @param rate
	 * @return
	 */
	public static double monthlyPayment(int loanAmount,int yYear,double rate)
	{
		double r;
		int n = 12 *yYear;
		r = rate/(12*100);
		return (loanAmount*r)/(1-(Math.pow((1+r), -n)));
	}
	/*
	 * static function to check Strings are anagram or not.
	 *  @param str
	 *  @param str1
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
	 * This Function calls All Sorting algorithm
	 * @param string[]
	 * @param int []
	 */
	public static void callAlgos(String[] sTring, int[] iNteger) 
	{
		// TODO Auto-generated method stub
		String [] algoArray = {"binarySearchString","binarySearchInt","insertionSortString","insertionSortInt","bubbleSortString","bubbleSortInt"};
		double elapsedTime[] = new double[algoArray.length];
		double startTime,endTime,eTime=0;
		startTime = System.nanoTime();
		System.out.println("Enter The String That You Want To Find");
		String stringFind = Util.scanner.next();
		if(Util.binarySearchString(Util.bubbleSortString(sTring),stringFind))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do binary search of String is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		System.out.println("Enter The value That You Want To Find");
		int findNumber = Util.scanner.nextInt();
		if(Util.binarySearchInt(Util.bubbleSortInt(iNteger),findNumber))
			System.out.println("Found");
		else
			System.out.println("Not Found");
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do binary search of Integers is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		Util.insertionSortString(sTring);
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do insertion Sort of String is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		Util.insertionSortInt(iNteger);
		endTime  = System.nanoTime();
		eTime = ((endTime-startTime)*Math.pow(10, -9));
		System.out.println("Time required to do insertion Sort of Integers is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		startTime = System.nanoTime();
		Util.bubbleSortString(sTring);
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do bubble Sort of String is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		
		
		startTime = System.nanoTime();
		Util.bubbleSortInt(iNteger);
		endTime  = System.nanoTime();
		eTime = (endTime-startTime)*Math.pow(10, -9);
		System.out.println("Time required to do bubble Sort Integers is = "+eTime+" seconds");
		elapsedTime[k++] = eTime;
		sortElapsedTime(elapsedTime,algoArray);
	}
	/*
	 * To arrange elapsedtime of each sorting method
	 * @param elapsedTime[]
	 * @param algoArray[]  
	 */
	public static void sortElapsedTime(double []elapsedTime,String[]algoArray) 
	{
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<elapsedTime.length;i++)
		{
			for(j=0;j<elapsedTime.length;j++)
			{
				if(elapsedTime[i]>elapsedTime[j])
				{
					//elapsed time sorting
					double temp = elapsedTime[i];
					elapsedTime[i] = elapsedTime[j];
					elapsedTime[j] = temp;
					//respective array sorting
					String temp1 = algoArray[i];
					algoArray[i] = algoArray[j];
					algoArray[j] = temp1;
				}
			 
			}
			
		}
		System.out.println("Sorted Array In Ascending Order:");
		for(i=elapsedTime.length-1;i>=0;i--)
		{
			System.out.println(algoArray[i]+" = "+elapsedTime[i]);
		}
		
	}
	 /*
	  * binarySearchString function to read string and find whether the user 
	  * expected word is there in the string or not
	  */
	 public static boolean binarySearchString(String [] city,String key)
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
			/*System.out.println("Sorted Array Of BubbleSort:");
			for(int i = 0;i<sTring.length;i++)
			{
				System.out.print( sTring[i]+"   ");
			}*/
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
		public static void insertionSortString(String[] string) 
		{
			// TODO Auto-generated method stub
			int i,j;
			/*for(j=1;j<string.length;j++)
			{
				i = j-1;  
				while(i>=0)
				{
					if(string[j].compareTo(string[i])<0)
					{
						String str;
						str = string[j];
						string[j] = string[i];
						string[i] = str;
						i-=1;
					}
				
				}
			}*/
			for(i = 1;i<string.length;i++) 
			{
				for(j =i;j>0;j--) 
				{
					if(string[j].compareTo(string[j-1])<0) 
					{
						 String temp = string[j];
						 string[j] = string[j-1];
						 string[j-1] = temp;
					}
				}
			}
			for(i=0;i<string.length;i++)
				System.out.print(string[i]+" ");
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

	
	 /*
	  * Function to find prime number.
	  * @param low
	  * @param high
	  * @param count
	  * @return []
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
	  * @param celTemp
	  * @return
	  */
	 public static double celToFah(double celTemp)
	 {
			double F;
			F = (celTemp * 9/5) + 32;
		    return F;

	 }
	 /*
	  * Function to convert fahrehneit to celcius
	  * @param tempFah
	  * @return
	  */
	 public static double fahToCal(double tempFah)
	 {
		double C;
		C = (tempFah -32) * 5/9; 
		return C;
	 }
	 /*
	  * unorderedList function to read data from the file
	  * search for required data
	  * sort and then add to file that is updated 
	  * @param str
	  * @throws IOException
	*/
	 public static void unorderedList(String str) throws IOException 
		{
			// TODO Auto-generated method stub
			int i;
			BufferedReader bfr=new BufferedReader(new FileReader(str));

			String reader;
			reader=bfr.readLine().toLowerCase();
			bfr.close();
			String data[]=reader.split(" ");
			String[] array = bubbleSortString(data);
			//
			for(i=0;i<array.length;i++)
			{
				list.insertData(array[i]);
			}
			searchWord(array);
		}
	 	/*
	 	 * search for word from file 
	 	 * @param array1
	 	 */
	 	private static void searchWord(String []array1) throws IOException 
		{
			char character = ' ';
			do
			{
				System.out.println("Enter a Word That You Want To Find:");
				String word = Util.scanner.next(); 
				
				if(list.search(word))
				{
					System.out.println("String is already there in List.");
					list.remove(word);
					System.out.println("so removed From List.");
				}
				else
				{
					System.out.println("String is not there in List.");
					//list.insertData(word);
					list.InsertRightPosition(word);
					System.out.println("Added To The List.");
					//appendlist(array1,word);
				}
				
				System.out.println("Do you want to find another word:");
				character = Util.scanner.next().charAt(0);
			}
			while(character =='Y'||character =='y');
			
			list.dispNode();
			addToFile();
				//System.out.println("List Content:");
				//for(String str:list)
				//System.out.println(str);
		}
	 	/*
	 	 * to append searched word into file
	 	 * @param array
	 	 * @param word
	 	 */
		public static void appendlist(String[] array, String word){
			String newArray[] = new String[array.length+1];
			for (int i = 0; i < newArray.length-1; i++) {
				newArray[i]=array[i];
			}
			newArray[array.length] = word;
			String [] sortList = bubbleSortString(newArray);
			for (int i = 0; i < sortList.length; i++) {
				System.out.print(sortList[i]+" ");
			}
		}
		/*
		 * writes data to the file
		 * @throws Exception
		 */
		private static void addToFile() throws IOException 
		{
		    FileWriter fr =null;
	        FileWriter fr1 =null;
	        try
	        {   
	        	File writeFile = new File("/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/bridgelabz/dsprograms/File.txt");
		        fr = new FileWriter(writeFile);
		        fr1 = list.writeListNode(fr);
		        System.out.println("Data added in file :");
	        }
	        catch(Exception e) 
	        {
	        	e.printStackTrace();
	        }
	        finally 
	        {
		        fr.close();
		        fr1.close();
		    }
			
		}
		/*
		 * enqueues and dequeues people from queue
		 * @param initCash
		 * @param numPeople
		 */
		public static <T> void cashCounter(int initCash, int numPeople)
		{
			// TODO Auto-generated method stub
			Queue <T> queue = new Queue<T>(numPeople*3);
			int i;
			int balanceAmount = initCash;
			//T  balance ;
			for(i=0;i<numPeople;i++)	
			{
				System.out.println("Enter your Name:");
				T name = (T) Util.scanner.next();
				queue.enQueue(name);
				System.out.println("Enter Your A/c No.:");
				T acNumber = (T) Util.scanner.next();
				queue.enQueue(acNumber);
				System.out.println("Enter The Balance That You Have:");
				T balance = (T) Util.scanner.next();
				queue.enQueue(balance);
			}
			for(i=0;i<numPeople;i++)	
			{
				T name = queue.deQueue();
				System.out.println("Hello "+name+" Welcome To The State Bank Of India.\n Please Give Your Bank Details for Further Process.");
				int acNumber = Integer.parseInt((String) queue.deQueue());
				int balance = Integer.parseInt((String) queue.deQueue());
				balanceAmount = bankCounter(balanceAmount,balance);
			}	
			System.out.println("All People Have Done Their Transaction Successfully");
			System.out.println(balanceAmount+" is available balance with bank.");
		}
		/*
		 * performs different operations and returns the balanced cash
		 * @param initCash
		 * @param balance
		 * @return
		 */
		public static int bankCounter(int initCash,int balance) 
		{
			// TODO Auto-generated method stub
			int cash = initCash;
			char opinion = ' ';
			do
			{
				System.out.println("Which Transaction Do you Want To Perform?Enter :\n1.deposit \n2.Withdraw ");
				int choice = Util.scanner.nextInt();
				switch(choice)
				{
					case 1: System.out.println("How Much Money You Want To Deposit:");
							int deposit = Util.scanner.nextInt();
							cash+=deposit;
							System.out.println("Transaction Successful.Thank You.please Visit Again.");
							System.out.println("Your Current Balance is: "+(balance+deposit));
							//return cash;
							break;
							
					case 2: System.out.println("How Much Money You Want To Withdraw:");
							int withdrawAmount = Util.scanner.nextInt();
				            if(cash<balance)
				            {
				            	System.out.println("Sorry!!Cash is Out Of Stock:");
				            	 break;
				            }
				            if(balance>=withdrawAmount && cash> balance)
				            {
				            	cash-=withdrawAmount;
				            	System.out.println("Transaction Successful.Thank You.please Visit Again.");
				            	System.out.println("Your Current Balance is: "+(balance-withdrawAmount));
				            }
				            else
				            {
				            	System.out.println("Sorry!!You Don't Have Enough Balance.");
				            	
				            }
				            // return cash;
				            break;
					default: System.out.println("Invalid Choice.");
			    }
				System.out.println("Do you Want to Continue:");
				opinion = Util.scanner.next().charAt(0);
			}while(opinion == 'Y' || opinion =='y');
			return cash;	
		}
		/*
		 * to check whether the given string is palindrome or not
		 * @param string
		 */
		public static void isPalindrome(String string) 
		{
			// TODO Auto-generated method stub
			Queue <Character> queue = new Queue<Character>(string.length()); 
			char [] characters = string.toCharArray();
			int count=0 ,i=0;
			for(i=0;i<characters.length;i++)
			{
				queue.enQueue(characters[i]);
			}
			for(i=characters.length-1;i>=0;i--)
			{
				//queue.peek();
				char ch = queue.deQueue();
				if(characters[i]==ch)
					count++;
					
			}
			if(count==characters.length)
				System.out.println("String is Palindrome.");
			else
				System.out.println("String is Not Palindrome.");		
		}
		/*
		 * to check whether the number is prime or not.
		 * @param low
		 */
		public static boolean isPrime(int low)
		{
			// TODO Auto-generated method stub
			int i,j,count = 0;
	                for(j=1;j<=low;j++)
	                {
	                    if(low%j==0) 
	                        count++;
	                }
	                if(count==2)
	                	return true;
	         
			return false;
		}
		/*
		 * print prime Number in Two d array
		 * @param low
		 * @param high
		 */
		public static void primeArray(int low, int high) 
		{
			// TODO Auto-generated method stub
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			int i,j,range=100,start=0;
			int mRows = 10;
			for (i = 0; i <mRows ; i++) 
			{
				list.add(new ArrayList<Integer>());
			}
			for (i = 0; i <mRows ; i++) 
			{
				for(j=start;j<high;j++)
				{
					if(isPrime(j) && j<=range)
						list.get(i).add(j);
				}
				start+=100;
				range+=100;
			}
			System.out.println("Prime Numbers:");
			for (i = 0; i <mRows ; i++) 
			{
				for (j = 0; j <list.get(i).size() ; j++) 
				{
					System.out.print(list.get(i).get(j)+" ");
				}
				System.out.println();
			}
		}
		/*
		 * print Prime anagrams in twod array
		 * @param low
		 * @param high
		 */
		public static void primeAnagram(int low, int high)
		{
			// TODO Auto-generated method stub
			ArrayList<String> prime= new ArrayList<String>();
			ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
			ArrayList<ArrayList<String>> listNotAnagram = new ArrayList<ArrayList<String>>();
			int i,j;
			
			for(i=0;i<2;i++)
			{
				list.add(new ArrayList<String>());
			}
			for(i=0;i<1;i++)
			{
				listNotAnagram.add(new ArrayList<String>());
			}
			
			for(i=low;i<=high;i++)
			{
				if(isPrime(i))
					prime.add(Integer.toString(i));
			}
			
			for(i=0;i<prime.size();i++)
			{
				for(j=i+1;j<prime.size();j++)
				{
					if(isAnagram(prime.get(i),prime.get(j)))
					{
						list.get(0).add(prime.get(i));
						list.get(1).add(prime.get(j));
					}
					if(!isAnagram(prime.get(i),prime.get(j)))
					{
						listNotAnagram.get(0).add(prime.get(i));
						//listNotAnagram.get(1).add(prime.get(j));
					}
				}
			}
			System.out.println("Prime Anagrams:");
			for (i = 0; i <2; i++) 
			{
				for (j = 0; j <list.get(i).size() ; j++) 
				{
					System.out.print(list.get(i).get(j)+" ");
				}
				System.out.println();
			}
/*			System.out.println("Prime And Not Anagrams:");
			for (i = 0; i <2; i++) 
			{
				for (j = 0; j <listNotAnagram.get(0).size() ; j++) 
				{
					System.out.print(listNotAnagram.get(0).get(j)+" ");
				}
				System.out.println();
			}*/
		}
		/*
		 * print prime anagrams using stack in reverse order
		 * @param low
		 * @param high
		 * @throws Exception
		 */
		public static void primeAnagramStack(int low, int high) throws Exception 
		{
			// TODO Auto-generated method stub
			GenericStack<String> stack = new GenericStack<String>(2);
			ArrayList<String> prime = new ArrayList<String>();
			for (int j = low; j <= high; j++) 
			{
				if (isPrime(j)) 
				{
					prime.add(Integer.toString(j));
				}
			}
			for (int i = 0; i < prime.size() - 1; i++) 
			{
				int j = i + 1;
				while (j < prime.size()) 
				{
					
					if (isAnagram(prime.get(i), prime.get(j))) 
					{
						stack.push(prime.get(i));
						stack.push(prime.get(j));
					}
					j++;
				}
			}
			for (int i = stack.size()-1; i >=0; i -=2) 
			{
				System.out.println(stack.pop() + " " + stack.pop());
			}
			
			
			int i = 0;
			/*while(!stack.isStackEmpty())
			{
				System.out.println(stack.pop() + " " + stack.pop());
				i+=2;
			}*/
		
		}
		/*
		 * print prime anagrams using Queue.
		 * @param low
		 * @param high
		 * @throws Exception
		 */
		public static void primeAnagramQueue(int low, int high)
		{
			// TODO Auto-generated method stub
			Queue<String> queue = new Queue<String>(400);
			ArrayList<String> prime = new ArrayList<String>();
			for (int j = low; j <= high; j++) 
			{
				if (isPrime(j)) 
				{
					prime.add(Integer.toString(j));
				}
			}
			for (int i = 0; i < prime.size(); i++) 
			{
				int j = i + 1;
				while (j < prime.size()) 
				{
					
					if (isAnagram(prime.get(i), prime.get(j))) 
					{
						queue.enQueue(prime.get(i));
						queue.enQueue(prime.get(j));
					}
					j++;
				}
			}
		/*	for (int i =0 ; i<=queue.size(); i+=2) 
			{
				System.out.println(queue.deQueue() + " " + queue.deQueue());
			}*/
			int i=0;
			while(!queue.isEmpty())
			{
				System.out.println(queue.deQueue() + " " + queue.deQueue());
				i+=2;
			}	
		}
		/*
		 * Display Calender Using Two D Datastructure
		 * @param month
		 * @param year
		 */
		public static void dispCalender(int month, int year)
		{
			// TODO Auto-generated method stub
			ArrayList<ArrayList<String>> date = new ArrayList<ArrayList<String>>();
			
			for (int i = 0; i < 6; i++) 
			{
				date.add(new ArrayList<String>());
			}
			// leave empty so that months[1] = "January"
		       String[] months = {"",                              
			           "January", "February", "March",
			           "April", "May", "June",
			           "July", "August", "September",
			           "October", "November", "December"
			       		};
		       
		       // days[i] = days in month i
		       int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		       // check for leap year
		       if (month == 2 && Util.LeapYear(year)) 
		    	   days[month] = 29;

		       System.out.println("   "+months[month]+" "+ year);
		       String dayOfWeek[] = {"S "," M "," T "," W "," T "," F "," S"};
		       for (int i = 0; i < dayOfWeek.length; i++)
		       {
		    	   System.out.print(" "+dayOfWeek[i]);
		       }
		       System.out.println();
		       // starting day
		       int day = 1 ;
		       int d = Util.weekDay(day,month, year);
		       int space = 0;
		       // print the calendar
		       for (int i = 0; i < 6; i++)
		       {
					if (i == 0) 
					{
						for (int j = 0; j < 7; j++) 
						{
							if (j < d) 
							{
								date.get(i).add("   ");
							}
							else 
							{
								date.get(i).add(" "+Integer.toString(day)+" ");
								day++;
									
							}
						}
					}
					else 
					{
						for (int j = 0; j < 7; j++)
						{
							if(day<=days[month])
							{
								if (space < day + 9)
								{
									date.get(i).add(" "+Integer.toString(day)+" ");
									day++;
									space++;
								}
								else
								{
									date.get(i).add(Integer.toString(day));
									day++;
								}
							}
						}
					}
				}
				
				for (int i = 0; i < date.size(); i++) 
				{
					for (int j= 0; j < date.get(i).size(); j++) 
					{
						if (space < day + 9)
						{
							System.out.print(" "+date.get(i).get(j));
							space++;
						} 
						else 
						{ 
						
							System.out.print(date.get(i).get(j));
						}
					}
					System.out.println();
				}
			
		}
		public static void dispQueueCalender(int month, int year) 
		{
			// TODO Auto-generated method stub
			Queue<Queue<String>> week = new Queue<Queue<String>>(7);
			
			for (int i = 0; i < 7; i++) 
			{
				week.enQueue(new Queue<String>(7));
			}
			// leave empty so that months[1] = "January"
		    String[] months = {"",                              
			           "January", "February", "March",
			           "April", "May", "June",
			           "July", "August", "September",
			           "October", "November", "December"
			       		};
		       
		       // days[i] = days in month i
		    int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		       // check for leap year
		    if (month == 2 && Util.LeapYear(year)) 
		    	days[month] = 29;

		    System.out.println("   "+months[month]+" "+ year);
		}
		/*
		 * Display Integer and other Two d Arrays.
		 * @param number_Rows
		 * @param number_Cols
		 */
		public static void arrays(int number_Rows, int number_Cols) 
		{
			// TODO Auto-generated method stub
			/*
			 * Declaration Of Array 
			 */
			PrintWriter print = new PrintWriter(new OutputStreamWriter(System.out));
			int [][] intArray = new int [number_Rows][number_Cols];
			double [][] douArray = new double [number_Rows][number_Cols];
			boolean [][] bolArray = new boolean [number_Rows][number_Cols];
			print.write("Enter Your Choice of Array");
			print.flush();
			int i ,j;
			int choice = Util.scanner.nextInt();

			switch(choice)
			{
				case 1 :print.write("You have opted for Integer Array.now Accept Array Elements:");
						print.flush();
						for(i=0;i<number_Rows;i++)
						{
							for(j=0;j<number_Cols;j++)
							{
								intArray[i][j] = Util.scanner.nextInt();
							}
						}
						print.println("Printing Array On Std.Output:");
						for(i=0;i<number_Rows;i++)
						{
							for(j=0;j<number_Cols;j++)
							{
								print.print(intArray[i][j]+" ");
								print.flush();
								
							}
							print.println();
							print.flush();
						}
						break;
				case 2 :print.write("You have opted for Double Array.now Accept Array Elements:");
				      	print.flush();
						for(i=0;i<number_Rows;i++)
						{
							for(j=0;j<number_Cols;j++)
							{
								douArray[i][j] = Util.scanner.nextDouble();
							}
						}
						print.println("Printing Array On Std.Output:");
						for(i=0;i<number_Rows;i++)
						{
							for(j=0;j<number_Cols;j++)
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
						for(i=0;i<number_Rows;i++)
						{
							for(j=0;j<number_Cols;j++)
							{
								bolArray[i][j] = Util.scanner.nextBoolean();
							}
						}
						print.println("Printing Array On Std.Output:");
						for(i=0;i<number_Rows;i++)
						{
							for(j=0;j<number_Cols;j++)
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
		/*
		 * Perform Merge sort on string array
		 * @param string
		 */
		public static String[] mergeSort(String[] string)
		{
			// TODO Auto-generated method stub
			int i,j,k;
			if(string.length==0)
				return null;
			if(string.length>1)
			{
				int mid = string.length/2;
				String[] lowerHalf = new String[mid];
				String[] higherHalf = new String[string.length-mid];
				for(i=0;i<mid;i++)
				{
					lowerHalf[i] = string[i];
				}
				
				for(i=mid;i<string.length;i++)
				{
					higherHalf[i-mid] = string[i];
				}
				mergeSort(lowerHalf);
				mergeSort(higherHalf);
				
				i=0;
				j=0;
				k=0;
				//merge left and right Array
				while(i<lowerHalf.length && j<higherHalf.length)
				{
					if(lowerHalf[i].compareTo(higherHalf[j])<0)
						string[k++] = lowerHalf[i++];
					else
						string [k++] = higherHalf[j++];
				}
				//merge Remaining Array
			
				while(i<lowerHalf.length)
					string[k++] = lowerHalf[i++];
				while(j<higherHalf.length)
					string[k++] = higherHalf[j++];
			}
			return string;
		}
		public static void hashFunction(String address) throws IOException
		{
			// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			BufferedReader bfr = new BufferedReader(new FileReader(address));
			String data = bfr.readLine().toLowerCase();
			String [] string = data.split(" ");
			int remainder;
			int [] fileData = new int[string.length];
			for (int i = 0; i < fileData.length; i++) 
			{
				fileData[i] = Integer.parseInt(string[i]); 
			}
			for (int i = 0; i < 11; i++) 
			{
				hashMap.put(i, new LinkedList<Integer>());
			}
			for (int i = 0; i < fileData.length; i++) 
			{
				remainder = fileData[i]%11;
				switch(remainder)
				{
					case 0 : hashMap.get(remainder).insertData(fileData[i]);
							 break;
					case 1 : hashMap.get(remainder).insertData(fileData[i]);
							 break;
					case 2 : hashMap.get(remainder).insertData(fileData[i]);
					 		 break;
					case 3 : hashMap.get(remainder).insertData(fileData[i]);
					 		 break;
					case 4 : hashMap.get(remainder).insertData(fileData[i]);
					  		 break;
					case 5 : hashMap.get(remainder).insertData(fileData[i]);
							 break;
					case 6 : hashMap.get(remainder).insertData(fileData[i]);
							 break;
					case 7 : hashMap.get(remainder).insertData(fileData[i]);
					 		 break;
					case 8 : hashMap.get(remainder).insertData(fileData[i]);
							 break;
					case 9 : hashMap.get(remainder).insertData(fileData[i]);
							 break;
					case 10: hashMap.get(remainder).insertData(fileData[i]);
					 		 break;
					default :System.out.println("Invalid data");
				}
			}
			for (int i = 0; i < 11; i++)
			{
				System.out.print("{ ["+i+"] : ");	
				hashMap.get(i).dispNode();
				System.out.print("}");
			}
			System.out.println();
			char character = ' ';
			do
			{
				System.out.println("Enter a number That You Want To Find:");
				int word = Util.scanner.nextInt();
				remainder = word%11;
				if(integerList.search(word))
				{
					System.out.println("integer is already there in List.");
					integerList.remove(word);
					System.out.println("so removed From List.");
				}
				else
				{
					System.out.println("int is not there in List.");
					hashMap.get(remainder).insertData(word);
					System.out.println("Added To The List.");
				}
				System.out.println("Do you want to find another word:");
				character = Util.scanner.next().charAt(0);
			}
			while(character =='Y'||character =='y');
			for (int i = 0; i < 11; i++)
			{
				System.out.print("{ ["+i+"] : ");	
				hashMap.get(i).dispNode();
				System.out.print("}");
			}
		} 
}
	
		/*public static void orderedList() throws IOException
		{
			// TODO Auto-generated method stub
		        File file=null;
				BufferedReader br =null;
				try
				{
					file = new File("/home/bridgeit/Desktop/Saurabh/JavaPrograms/File1");
					br = new BufferedReader(new FileReader(file));
					String line;
			        System.out.println("Reading File And Sorting:");	
					while((line = br.readLine())!=null) 
					{
			       
			        	String str= line;
			        		
			        	String SortArr[] = bubbleSortString(str);
			        	int length = SortArr.length;
			        	for(int i=0;i<length;i++) 
			        	{
			        		if(SortArr[i]==" ")
			        		{
			        			continue;
			        		}else
			        		{
			        			
			        			integerList.insertData(SortArr[i]);
			        		}
			        	}
			        	
			        }
				}
				catch(Exception e) 
				{
					e.printStackTrace();
				}finally
				{
					br.close();
				}  	
				integerList.dispNode(); 
				System.out.println("");
		        System.out.println("Enter a element to search :");
		        String num="";
		        String strNo = scanner.nextLine();
		        int ch = integerList.search(num);
		        
		        if(ch==0) 
		        {
		        	System.out.println("Num is Not present in a list So we insert it");
		        	integerList.InsertRightPosition(num);
		        	System.out.println("After insert :");
		        	integerList.dispNode();
		         }
		        else
		        {
		        	System.out.println(ch+" Times num present in a list & we delete it");
		        	for(int i=0;i<ch;i++) 
		        	{
		        		integerList.remove(num);
		        	}
		        	
		        }   
			}
		/*public static char[] bubbleSort(String str){
			
			char charArr[] = str.toCharArray();  
			int size = charArr.length;
			
			for(int i=0;i<size-1;i++) {
				int flag = 0;
				for(int j=0;j<size-1;j++) {
					
					if(charArr[j]>charArr[j+1]) {
						flag = flag+1;
						char temp = charArr[j];
						charArr[j] = charArr[j+1];
						charArr[j+1] = temp;
					}
				} 
				if(flag==0){
					break;
				}
			}
			return charArr;
			
		}*/

		

