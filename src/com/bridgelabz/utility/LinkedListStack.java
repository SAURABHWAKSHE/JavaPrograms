package com.bridgelabz.utility;


public class LinkedListStack<T> 
{
	private Node1<T> top;
	private int size;

	public LinkedListStack() 
	{
		top = null;
		size = 0;
	}
   /*
    * This method is to create a node and add the element in that node
    * @param element is the value to be stored in a particular node
    */
	public void push(T element)
	{
		Node1<T> nd = new Node1<T>(element, null);
		if (top == null) 
		{
			top = nd;
		} else
		{
			nd.setNext(top);
			top = nd;
		}
		size++;
	}
   
	/*
    * This method is used to retrieve and remove the data from stack
    * @returns the value in a particular  node
    */
	public T pop() 
	{
		Node1<T> nd = null;
		T element = null;
		if (isEmpty())
			System.out.println();
		nd = top;
		top = nd.getNext();
		element = nd.getData();
		size--;
		return element;
	}

	/*
    * This method helps to retrieve the data from stack
    * @returns the value in a particular  node
    */
	public T peek() 
	{
		if(isEmpty())
			System.out.println("Stack is empty..!!");
		return top.getData();
	}

	/*
    * This method helps to check whether the stack is empty or not
    * @returns true if empty
    */
	public boolean isEmpty() 
	{
		return (top == null);
	}
   
	/*
    * This method is used to find the size of the stack
    * @returns the size of the stack
    */
	public int size() 
	{
		return size;
	}
}

class Node1<T> {

	private Node1<T> next;
	private T data;

	public Node1(T value, Node1<T> node)
	{
		data = value;
		next = node;
	}
	/*
	 * This method sets data to the node
	 * @param data is the value to be stored 
	 */
	public void setData(T data) 
	{
		this.data = data;
	}
   
	/*
	 * This method sets the next to the node
	 * @param link is the address of next node to be stored
	 */
	public void setNext(Node1<T> next)
	{
		this.next = next;
	}
   
	/*
	 * This method is used to get the Next of a node
	 * @return the next of a node
	 * 
	 */
	public Node1<T> getNext() 
	{
		return next;
	}
   
	/*
	 * This method is used to get the data of a particular node
	 *
	 * @return the data of a particular node
	 * 
	 */
	public T getData() 
	{
		return data;
	}
}