package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.GenericStack;
import com.bridgelabz.utility.Util;

public class BalancedParanthesis
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		GenericStack<Character> stack = new GenericStack<Character>(2);
		System.out.println("Enter The Arithmatic Expression:");
		String expression = Util.scanner.nextLine();
		int i;
		char[] charArray = expression.toCharArray();
		for (int j = 0; j < charArray.length; j++) 
		{
			if(charArray[j]=='(')
				stack.push(charArray[j]);
			if(charArray[j]==')')
				stack.pop();
		}
		if(stack.isStackEmpty())
			System.out.println("Expression is balanced. ");
		else
			System.out.println("Expression is not balanced. ");
		
	}

}
