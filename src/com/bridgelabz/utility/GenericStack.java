package com.bridgelabz.utility;

public class GenericStack<T extends Object> 
{
	 
    private int size;
    private T[] stack;
    private int top;
    private int mSize;
    
   /*
    * Constructor with param to create stack with size
    * @param size
    */
    public GenericStack(int size) 
    {
        this.size = size;
        this.stack = (T[]) new Object[size];
        this.top = -1;
        this.mSize = 0;
    }
 
    /*
     * This method Adds a new Entry 
     * To The Top OF Stack
     * @param entry
     * @param top
     */
    public void push(T entry)
    {
        if(this.isStackFull())
        {
            //System.out.println(("Stack Overflow"));
            this.increaseStackCapacity();
        }
        //System.out.println("Adding: "+entry);
        this.mSize++;
        this.stack[++top] = entry;
        
    }
 
    /*
     * This method removes an entry from the 
     * top of the stack.
     * @return
     * @throws Exception
     */
    public T pop() throws Exception {
        if(this.isStackEmpty()){
           // throw new Exception("Stack Underflow");
        }
        T entry = this.stack[top--];
        this.mSize--;
        //System.out.println("Removed entry: "+entry);
        return entry;
    }
    /*
     * This method returns top of the stack
     * without removing it.
     * @return
     */
    public T peek()
    {
        return stack[top];
    }
 
    private void increaseStackCapacity()
    {
         
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[this.size*2];
        for(int i=0;i<size;i++)
        {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
        this.size = this.size*2;
    }
     
    /*
     * This method returns true if the stack is 
     * empty
     * @return
     */
    public boolean isStackEmpty()
    {
        return (top == -1);
    }
 
    /*
     * This method returns true if the stack is full
     * @return
     */
    public boolean isStackFull() 
    {
        return (top == size - 1);
    }

	public int size() {
		// TODO Auto-generated method stub
		//return size;
		return this.mSize;
	}
     
   
}
