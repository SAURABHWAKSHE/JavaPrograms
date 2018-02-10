package com.bridgelabz.utility;

import com.bridgelabz.utility.GenericLinkedList;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
	static LinkedList <Integer> linkList = new LinkedList<Integer>();
	static GenericLinkedList <String> list= new GenericLinkedList<String>(); 
	static GenericLinkedList <Integer> integerList= new GenericLinkedList<Integer>(); 
	static HashMap <Integer,LinkedList<Integer>> hashMap = new HashMap<Integer,LinkedList<Integer>>(); 
	static char [][] playBoard = new char [3][3];
	/*
	 * function to find a year is leapyear or not
	 * @param year
	 * @return
	 */
	public static boolean LeapYear(int year)
	{
		if(year%400 == 0||year%4 == 0 && year%100!=0)
			return true;
		else
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
	 * calculates The Nth Power of two
	 * @param power
	 */
	public static void twoPower(int power) {
		// TODO Auto-generated method stub
		int i;
		if(power<=31)
		{
			System.out.println("2's Powers Upto 2^"+power+":");
			for(i = 0;i<=power;i++)
			{
				System.out.println(Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("N should be less than or equal to 31");
		}
	}
	// Tic Tac Toe Game Methods..
		/*
		 * This method is used to play tic tac toe game
		 * 
		 * @print the board after each player plays
		 */
		public static void playTicTacToe() {
			initializeBoard();
			do {
				if (isBoardFull())
					break;
				computersTurn();
				printBoard();
				if (checkForWin()) {
					System.out.println("Computer wins...");
					break;
				}
				if (isBoardFull())
					break;
				playerTurn();
				printBoard();
				if (checkForWin()) {
					System.out.println("Player wins...");
					break;
				}
			} while (!checkForWin() && !isBoardFull());

			if (isBoardFull() && !checkForWin())
				System.out.println("Game was a tie...");
		}

		/*
		 * This method is used to initialize the cross game board
		 */
		public static void initializeBoard() {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					playBoard[i][j] = ' ';
				}
			}
		}

		/*
		 * This method is used to print the cross game board
		 */
		public static void printBoard() {
			for (int i = 0; i < 3; i++) {
				System.out.println();
				for (int j = 0; j < 3; j++) {
					System.out.print(playBoard[i][j]);
					if (j < 2)
						System.out.print("  | ");
				}
				System.out.println();
				if (i < 2)
					System.out.print("-------------");
			}
		}

		/*
		 * This method is used to check whether specified row and column is empty
		 * 
		 * @param mRow is the index for row
		 * 
		 * @param mColumn is the index for column
		 * 
		 * @return true if empty else false
		 */
		public static boolean isEmpty(int noOfRow, int noOfColumn) {
			return (playBoard[noOfRow][noOfColumn] == ' ');
		}

		/*
		 * This method is used to check for winner
		 * 
		 * @return true if anyone one of them is true
		 */
		public static boolean checkForWin() {
			return (checkForRow() || checkForColumn() || checkForDiagonals());
		}

		/*
		 * This method is used to check winning condition for row
		 * 
		 * @return true if whole row contains same character
		 */
		public static boolean checkForRow() {
			for (int i = 0; i < 3; i++) {
				if (checkRowColumn(playBoard[i][0], playBoard[i][1], playBoard[i][2])) {
					return true;
				}
			}
			return false;
		}

		/*
		 * This method is used to check winning condition for column
		 * 
		 * @return true if whole column contains same character
		 */
		public static boolean checkForColumn() {
			for (int i = 0; i < 3; i++) {
				if (checkRowColumn(playBoard[0][i], playBoard[1][i], playBoard[2][i])) {
					return true;
				}
			}
			return false;
		}

		/*
		 * This method is used to check winning condition for diagonals
		 * 
		 * @return true if either of the one diagonal has same character
		 */
		public static boolean checkForDiagonals() {
			return (checkRowColumn(playBoard[0][0], playBoard[1][1], playBoard[2][2])
					|| checkRowColumn(playBoard[1][2], playBoard[1][1], playBoard[2][2]));
		}

		/*
		 * This method is used to check if the characters are same
		 * 
		 * @param c1,c2 nad c3 are characters 'x' or 'o'
		 * 
		 * @return true if all three characters are same
		 */
		public static boolean checkRowColumn(char character1, char character2, char character3) {
			return (character1 != ' ' && character1 == character2 && character2 == character3);
		}

		/*
		 * This method is used to check board is full or not
		 * 
		 * @return true if board is full
		 */
		public static boolean isBoardFull() {
			boolean isFull = true;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (playBoard[i][j] == ' ')
						isFull = false;
				}
			}
			return isFull;
		}

		/*
		 * This method is used to generate random cell no for computer
		 * 
		 */
		public static void computersTurn() {
			int row = (int) (Math.random() * 3);
			int column = (int) (Math.random() * 3);
			if (isEmpty(row, column)) {
				playBoard[row][column] = 'X';
			} else {
				if (!isBoardFull())
					computersTurn();
				else
					System.out.println("Board is full");
			}
		}

		/*
		 * This method is used to accept random cell no from player
		 * 
		 */
		public static void playerTurn() {
			System.out.println("Enter row and Column between 0 to 2");
			int row = Util.scanner.nextInt();
			int column = Util.scanner.nextInt();
			if (isEmpty(row, column)) {
				playBoard[row][column] = 'O';
			} else {
				if (!isBoardFull())
					playerTurn();
				else
					System.out.println("Board is full");
			}
		}

	
	/*
	 * calculates the number of heads and tails
	 * @param number_Times
	 */
	public static void flipCoin(int number_Times)
	{
		// TODO Auto-generated method stub
		int i;
		int Number_Heads = 0,Number_Tails = 0;
		if(number_Times>0)
		{
			for(i=0;i<number_Times;i++)
			{
				if(Math.random()>0.5)
					Number_Heads++;
				else
					Number_Tails++;
			}
		}
		else
		{
			System.out.println("Run Again And Enter a positive Number");
			System.exit(0);
		}
		System.out.println("Heads:"+Number_Heads);
		System.out.println("Tails:"+Number_Tails);
		System.out.println("Head Percentage:"+(Number_Heads*100)/number_Times);
		System.out.println("Tail Percentage:"+(Number_Tails*100)/number_Times);

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
	 * calculates the nth harmonic value
	 * @param hARMONIC_NUMBER
	 */
	public static void harmonicNumber(int hARMONIC_NUMBER)
	{
		// TODO Auto-generated method stub
		int i;
		double sumTotal=0;
		if(hARMONIC_NUMBER>0)
		{
			for(i=1;i<=hARMONIC_NUMBER;i++)
			{
				sumTotal = sumTotal + Math.pow(i,-1);
			}
		}
		else
		{
			System.out.println("Please Enter Value of N greater than 0 ");
			System.exit(0);
		}
		System.out.println(hARMONIC_NUMBER+"th Harmonic Value = "+sumTotal);
	}
	/*
	 * calculates the prime factors of the given number
	 * @param number
	 */
	public static void primeFactor(int number) 
	{
		// TODO Auto-generated method stub
		int i; 
		while(number%2==0)
		{
			System.out.print(2+" ");
			number/=2;
		}
		for(i=3;i<=Math.sqrt(number);i=i+2)
		{
			if(number%i == 0)
			{
				System.out.print(i+" ");
				number/=i;
			}
		}
		if(number>2)
			System.out.print(number);
	}
	 /*
	  * find the distinct triplets and returns the 
	  * count of numbers of distinct triplets
	  * @param []
	  * @return 
	  */
	public static int triplets(int[] tripletArray) 
	{
		// TODO Auto-generated method stub
		int i,j,k;
		System.out.println("Distinct Triplets:");
		int count = 0;
		for(i=0 ;i<tripletArray.length;i++)
		{
			for(j=i+1;j<tripletArray.length;j++)
			{
				for(k=j+1 ;k<tripletArray.length;k++)
				{
					int sum = tripletArray[i]+tripletArray[j]+tripletArray[k];
					if(sum==0)
					{
						System.out.println("("+ tripletArray[i]+","+ tripletArray[j]+","+ tripletArray[k]+")");
						count++;
					}
				}
			}
		
		}
		return count ;
	}
	/*
	 * calculates the win and loss percentage depending on the 
	 * chances of win and loose by investing a bet amount in ech Bet
	 * @param stake
	 * @param trials
	 * @param goal
	 * @param betAmount
	 */
	public static void betTrials(double stake,double trials,double goal, int betAmount)
	{
		int win = 0;
	    double winPerc=0,lossPerc=0;
        for(int i = 0;i < trials;i++)
        {
        	double cash = stake;
            while (cash > 0 && cash < goal)
            {
          
                if(Math.random() > 0.5)
                	cash = cash + betAmount;
                else
                	cash = cash - betAmount;
            }
            if(cash == goal)
                win++;
        }
		//PRINTING OUTPUT
	     System.out.println("Congrats!! You Won: " + win+" Times Out of "+trials);
	   	 winPerc = ((win/trials)*100);
	     System.out.println("Percentage of win is: " + winPerc);
	   	 lossPerc = (100-winPerc);
	     System.out.println("Percentage of loss is: " +lossPerc);
	}
	/*
	 * finds permutation of the given string
	 * @param permutestring
	 * @param l
	 * @param r
	 */
	public static void permute(String permutstring, int l, int r)
	{
		if (l == r)
        {
            System.out.println("l==r :");
            System.out.println(permutstring);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                System.out.println("Before swap :"+permutstring);    
                permutstring = swap(permutstring,l,i);
                System.out.println("After swap :"+permutstring);
                permute(permutstring, l+1, r);
                
            }
        }
	        
	}
	/*
	 * swap remaining letters of the given string
	 * @param a
	 * @param l
	 * @param r
	 */
	public static String swap(String a, int i, int j)
	{
		 char temp;
	     char[] charArray = a.toCharArray();
	     temp = charArray[i] ;
	     charArray[i] = charArray[j];
	     charArray[j] = temp;
	     return String.valueOf(charArray);
	}
	/*
	 * finds the roots of the quadratic equation
	 * @param paramA
	 * @param paramB
	 * @param paramC
	 */
	public static void solveEquation(int paramA, int paramB, int paramC) 
	{
		// TODO Auto-generated method stub
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
	/*
	 * algorithm to find a guessed number between a range
	 * @param start 
	 * @param end
	 * @return
	 */
	public static int findNum(int start, int end)
	{
		// TODO Auto-generated method stub
		int mid=(start+end)/2;

		if(start==mid)
			System.out.println("is "+mid+" your Number");
		else
			System.out.println("Is your Number present  between "+start+" to mid="+mid+" ?");
		try {
			if(start==end)
			{
				System.out.println("I Think "+mid+" is your Number");
				System.exit(0);
			}
				
			else if(Util.scanner.nextBoolean()) 
				findNum(start, mid);
			else
				findNum(mid+1, end);
		}
		catch(Exception exception) {
			System.out.println("Exception:"+exception);
		}
		return 0;
	}
	/*
	 * gives change to user with minimum number of possible notes
	 * @param aMount
	 */
	public static void toChange(int aMount) 
	{
		// TODO Auto-generated method stub
		int i,count=0; 
		int [] nNotes = {1,2,5,10,50,100,500,1000};
		try 
		{
			while(aMount>0)
			{
				for(i=nNotes.length-1;i>=0;i--)
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
		public static void insertionSortString(String[] string) 
		{
			// TODO Auto-generated method stub
			int i,j;
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
			BufferedReader bfr = new BufferedReader(new FileReader(str));

			String reader;
			reader=bfr.readLine().toLowerCase();
			bfr.close();
			String data[]=reader.split(" ");
			String[] array = bubbleSortString(data);
			for(i=0;i<array.length;i++)
			{
				System.out.print(array[i]+" ");
				System.out.println();
				list.insertData(array[i]);
			}
			searchWord();
	 }
	 	/*
	 	 * search for word from file 
	 	 * @param array1
	 	 */
	 	private static void searchWord() throws IOException 
		{
	 		boolean value =false;
			char character = ' ';
			do
			{
				System.out.println("Enter a Word That You Want To Find:");
				String num = Util.scanner.next().toLowerCase(); 
				value=list.search(num);
				if(value)
				{
					System.out.println("String is already there in List.");
					list.remove(num);
					System.out.println("so removed From List.");
				}
				else
				{
					System.out.println("String is not there in List.");
					//list.insertData(word);
					list.InsertRightPosition(num);
					System.out.println("Added To The List.");
				}
				System.out.println("Do you want to find another word:");
				character = Util.scanner.next().charAt(0);
			}
			while(character =='Y'||character =='y');
			list.dispNode();
			addToFile();
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
		        File writeFile = new File("/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/bridgelabz/dsprograms/Unorder.txt");
		        fr = new FileWriter(writeFile);
		        fr1 = list.writeListNode(fr);
		        System.out.println("updated list successfully added in file :");    
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
		private static FileWriter writeListNode(FileWriter fr) throws IOException {
			// TODO Auto-generated method stub
			

	        Node head = null;
			if(head==null) 
	        {
	            System.out.println("Linklist is empty :");
	            System.exit(0);
	        }
	        else 
	        {
	            Node temp = head;
	            while(temp!=null)
	            {
	                fr.write(temp.data+" ");
	                temp = temp.next;
	            }
	        }
	        return fr;
		}
		/*
		 * enqueues and dequeues people from queue
		 * @param initCash
		 * @param numPeople
		 */
		public static <T> void cashCounter(int initCash, int numPeople)
		{
			// TODO Auto-generated method stub
			GenericQueue <T> queue = new GenericQueue<T>(numPeople*3);
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
			Queue <Character> queue = new Queue<Character>(); 
			char [] characters = string.toCharArray();
			int count=0 ,i=0;
			for(i=0;i<characters.length;i++)
			{
				queue.enQueue(characters[i]);
			}
			for(i=characters.length-1;i>=0;i--)
			{
				
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
		 * it checks for the number is present in the array or not
		 * @param array
		 * @param item
		 * @return
		 */
		public static boolean contains(int[] array, int item)
		{
			for (int number : array)
			{
				if (item == number) 
				{
					return true;
				}
			}
			return false;
		}     
		/*
		 * stores distinct random numbers into array
		 * @param Number_Times
		 * @param Number_Random  
		 * @return []
		 */
		public static int [] randNumber(int Number_Times,int Number_Random)
		{
			int i,count=0,distinct=0;
			int [] dDistinct ;
			/*
			 * Array Declaration to Store Distinct Numbers
			 */
		
			dDistinct = new int [Number_Times];
			while(distinct<Number_Times)
			{
				long random = (long) (100+Math.random() * (999-100));
				count++;
				if(contains(dDistinct,(int) random))
					continue;
				else
				{
					dDistinct[distinct++] = (int)random;
					
				}
				/*if(distinct == Number_Times)
					break;*/
			}
			
			System.out.println("we need to generate "+count+" random numbers to print "+Number_Times+" distinct Coupon Numbers.");
			return dDistinct;
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
					//String.format ("%3d", list.get(i).get(j));
					System.out.print(String.format ("%3d", list.get(i).get(j))+" ");
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
			Stack<String> stack = new Stack<String>();
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
			/*int i = 0;
			while(!stack.isStackEmpty())
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
			Queue<String> queue = new Queue<String>();
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
			while(true)
			{
				if(!queue.isEmpty())
					System.out.println(queue.deQueue() + " " + queue.deQueue());
				//i+=2;
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
		       String dayOfWeek[] = {" S "," M "," T "," W "," T "," F "," S"};
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
		/*
		 * This static method is to Map the number according to remainder generated
		 * after dividing by 11
		 * @param mSourceAddress is the address assign to file reader
		 * @throws Exception
		 */
		public static void hashFunction(String mSourceAddress) throws IOException {
			for (int i = 0; i < 11; i++) {
				hashMap.put(i, new LinkedList<Integer>());
			}
			BufferedReader br = new BufferedReader(new FileReader(mSourceAddress));
			String string = br.readLine();
			String[] array = string.split(" ");
			for (String number : array) {
				int mNumber = Integer.valueOf(number);
				addToSlot(mNumber);
				linkList.add(mNumber);
			}
			br.close();
			searchNumber(mSourceAddress);
		}

		/*
		 * This method is used to search the number in the file. If found then
		 * delete or If not found then add
		 */
		public static void searchNumber(String mSourceAddress) throws IOException {
			char answer = ' ';
			do {
				System.out.println("Enter the number to be searched..");
				int number = scanner.nextInt();
				if (linkList.contains(number)) {
					System.out.println(number + " is found.. deleted from file..");
					linkList.remove(linkList.indexOf(number));
					
					
				} else {
					System.out.println(number + " is not found..added to file.. ");
					linkList.add(number);
					addToSlot(number);
				}
				
				System.out.println("Do u wish to continue..type(Y/N)");
				answer = scanner.next().charAt(0);
			} while (answer == 'Y' || answer == 'y');
			for (int i = 0; i < hashMap.size(); i++) {
				System.out.print("["+i+"] :");
				for (int j = 0; j < hashMap.get(i).size(); j++) {
					System.out.print(hashMap.get(i).get(j) + "  ");
				}
				System.out.println();
			}
			String strNumbers = "";
			for (int i = 0; i < hashMap.size(); i++) {
				for (int j = 0; j < hashMap.get(i).size(); j++) {
					strNumbers = strNumbers+hashMap.get(i).get(j)+ " "; 
				}
			}
			FileWriter fr = new FileWriter("/home/bridgeit/Desktop/Saurabh/JavaPrograms/src/com/bridgelabz/dsprograms/File.txt");
			fr.write(strNumbers);
			fr.flush();
			fr.close();
			
		}

	    /*
		* This static method is to add the particular slot according to the
		* remainder after dividing by 11
		* @param mNumber is an integer
		*/
		public static void addToSlot(int mNumber)
		{
			int remainder = 0;
			remainder = mNumber % 11;
			hashMap.get(remainder).add(mNumber);
		}
		/*
		 * prints calender using queue
		 * @param month 
		 * @param year
		 */
		public static void queueCalender(int month, int year)
		{
			// TODO Auto-generated method stub
			int count=0;
			int number =1;
			LinkedListQueue<LinkedListQueue<String>> queue = new LinkedListQueue<LinkedListQueue<String>>();
			for(int i=0;i<6;i++) 
			{
			queue.enqueue(new LinkedListQueue<String>());
			}
			//to return the day where we will start the month
			int day=weekDay(number,month, year);
			//making a Queue to store the days of the week
			queue.getAtPosition(0).enqueue("sun");queue.getAtPosition(0).enqueue("mon");queue.getAtPosition(0).enqueue("tue");
			queue.getAtPosition(0).enqueue("wed");queue.getAtPosition(0).enqueue("thr");queue.getAtPosition(0).enqueue("fri");
			queue.getAtPosition(0).enqueue("sat");
			
			//array list for number of days that a month carries
			int []daysOfTheMonths = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			String[] months = {"",                              
			           "January", "February", "March",
			           "April", "May", "June",
			           "July", "August", "September",
			           "October", "November", "December"
			       		};
			//Setting feb as 29 if the year is leap
			if(LeapYear(year)&& month==2)
				daysOfTheMonths[2]=29;
			
			for(int j = 1; j < 7; j++ ) 
			{
				for(int k =0;k<7;k++) 
				{
					if(count < day) 
					{
						queue.getAtPosition(j).enqueue("   ");
						count++;
					}
					else if(number<=daysOfTheMonths[month]) 
					{
						if(number<10)
							queue.getAtPosition(j).enqueue(" "+Integer.toString(number++)+" ");
						else
						queue.getAtPosition(j).enqueue(Integer.toString(number++)+" ");
					}
				}
		    }
			System.out.println(" "+months[month]+" "+year);
			for(int i=0;i<6;i++) 
			{
				for(int j =0;j<7;j++)
				{
					String date =queue.getAtPosition(i).dequeue();
					if(date==null)
					{
						break;
					}
					System.out.print(" "+date);
				}
				System.out.println();
			}
		}
	/*
	 * prints calender using stack
	 * @param month
	 * @param year
	 */
	public static void stackCalender(int month, int year) 
	{
			// TODO Auto-generated method stub
		int count=0;
		int number =1;
		int indexCounter =0;
		int loopCounter =0;
		LinkedListStack<String> stack1=new LinkedListStack<>();
		LinkedListStack<String> stack2 = new LinkedListStack<String>();
		String []weekDays = {"sun","mon","tue","wed","thr","fri","sat"};
		
		//array list for number of days that a month carries
		int []daysMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
				
		//Setting feb as 29 if the year is leap
		if(LeapYear(year) && month==2)
			daysMonth[2]=29;
		
		//to return the day where we will start the month
		int day=weekDay(number,month, year);		
		
		//for(int i = 0; i < 7; i++ ) {
		while(count < day) {
			stack1.push("   ");
		    count++;
		}
		while(number<=daysMonth[month]) 
		{
			if(number<10)
				stack1.push(" "+Integer.toString(number++)+" ");
			else
				stack1.push(Integer.toString(number++)+" ");
		}
		//to make sure that printing array doesnt runs out of loop
		indexCounter =count+(number-1);
		
		//moving elements from one stack to another
		for(int i=stack1.size()-1;i>=0;i--) 
		{
			stack2.push(stack1.pop());
		}
		
		//Displaying the Calander
		//month and year
		System.out.println(" "+daysMonth[month]+" "+year);
		//days of the week
		for (int i = 0; i < weekDays.length; i++) 
		{
			System.out.print(" "+weekDays[i]);
		}
		System.out.println();
		for(int i =0;i<6;i++) 
		{
			for(int j=0;j<7;j++) 
			{
				if(loopCounter==indexCounter)
					break;
				System.out.print(" "+stack2.pop());
				loopCounter++;
			}
			System.out.println();
		}
	
	}
}