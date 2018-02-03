package com.bridgelabz.utility; 

class Stack
{
    static int size ;
    static int top;
    static int stack[];
 
   
    Stack(int size)
    {
        top = -1;
        this.stack = new int[size];
    }
 
    public static boolean push(int x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            stack[++top] = x;
            return true;
        }
    }
 
    public static int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = stack[top--];
            return x;
        }
    }
    public static int peek()
    {
		return stack[top];
    	
    }
    
    public static boolean isEmpty()
    {
        return (top < 0);
    }
    
    public static boolean isFull()
    {
    	return (top == size-1);
    }
    
}
 
// Driver code
class Main
{
    public static void main(String args[])
    {
    	System.out.println("Enter Stack size:");
    	int size = Util.scanner.nextInt();
        Stack s = new Stack(size);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}