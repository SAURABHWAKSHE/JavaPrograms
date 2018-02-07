package com.bridgelabz.utility;

import java.util.NoSuchElementException;

public class Stack<T>
{
	private Node<T> top = null;
	private int size=0;
    /*
    * Helper Class for Stack.
    */
    private static class Node<T> 
    {
        private T data;
        private Node<T> next = null;

        Node(T element) 
        {
            data = element;
        }
    }
    public void push(T element)
    {
        Node<T> newItem = new Node<T>(element);

        if (top == null) 
        {
            top = newItem;
        } else 
        {
            // New Top
            newItem.next = top;
            top = newItem;
        }
        size++;
    }
    public T pop() 
    {
        if (top == null) 
        {
            throw new NoSuchElementException("The stack is empty.");
        }

        T output = top.data;
        top = top.next;
        size--;
        return output;
    }
    public T peek() 
    {
        if (top == null) 
        {
            throw new NoSuchElementException("The stack is empty.");
        }
        return top.data;
    }
    public boolean isEmpty() 
    {
        return top == null;
    }
    public int size()
    {
		return size;
    }
}