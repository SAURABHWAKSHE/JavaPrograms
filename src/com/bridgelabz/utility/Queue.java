package com.bridgelabz.utility;

import java.util.NoSuchElementException;

public class Queue<Item>
{
    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

    // helper linked list class
    private class Node
    {
        private Item item;
        private Node next;
    }

    /*
     * Initializes an empty queue.
     */
    public Queue() {
        first = null;
        last  = null;
        n = 0;
    }

    /*
     * Is this queue empty?
     * @return true if this queue is empty; false otherwise
     */
    public boolean isEmpty()
    {
        return first == null;
    }

    /*
     * Returns the number of items in this queue.
     * @return the number of items in this queue
     */
    public int size()
    {
        return n;     
    }

    /*
     * Returns the item least recently added to this queue.
     * @return the item least recently added to this queue
     * @throws java.util.NoSuchElementException if this queue is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return first.item;
    }

    /*
     * Adds the item to this queue.
     * @param item the item to add
     */
    public void enQueue(Item item) 
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) 
        	first = last;
        else         
        	oldlast.next = last;
        n++;
    }

    /*
     * Removes and returns the item on this queue that was least recently added.
     * @return the item on this queue that was least recently added
     * @throws java.util.NoSuchElementException if this queue is empty
     */
    public Item deQueue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;   // to avoid loitering

        return item;
    }

	public Object get(int index) {
		// TODO Auto-generated method stub
		return index;
	}
}