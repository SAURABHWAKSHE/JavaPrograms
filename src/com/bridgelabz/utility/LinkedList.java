package com.bridgelabz.utility;

import java.io.FileWriter;
import java.io.IOException;

class Node<T>
{
    protected T data;
    protected Node next;
   
	Node(T num)
	{
	    this.data = num;
	    next = null;
	}
}
public class LinkedList<T> 
{
    static int el=0;
    protected Node head;
       
    public LinkedList()
    {
        head = null;
    }
   
    //@SuppressWarnings("unchecked")
    public <T> void insertData(T data)
    {
        if(head==null) 
        {
        	head= new Node(data);
        }
        else 
        {
        	Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new Node(data);
        }
    }
   @SuppressWarnings({ "rawtypes", "unchecked" })
    public void PrintLinkNode(Queue link) 
    {
        Node temp=head;
        while(temp!=null) 
        {
            link.enQueue(temp.data);
            temp=temp.next;
        }
    }
    public void PrintLinkNode(LinkedList<T> myobj)
    {
    	Node temp=head;
        while(temp!=null) 
        {
        	myobj.insertData(temp.data);
            temp=temp.next;
        }
    }
    public void dispNode() 
    {
    	Node temp=head;
        while(temp!=null) 
        {
        	System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public int[] StorePrintLinkNode() 
    {
        int MyArray[] = new int[100];
        int i=0;
        Node temp=head;
        while(temp!=null)
        {
        	MyArray[i++]=(int)temp.data;
            temp=temp.next;
        }
        return MyArray;
    }
    public boolean search(T data) 
    {
    	 boolean flag=false;
         Node temp = head;
         while(temp!=null) 
         {
            if(temp.data==data) 
            {
                 flag = true;
                 break;
            }
            temp=temp.next;
         }
         return flag;
    }
    
    public void remove(T data)  
    {
        if(head.data.equals(data))
        {
            head = head.next;
        }
        else 
        {
            Node temp = head;
            Node prev = null;
            while(temp!=null) 
            {
                if(temp.data.equals(data)) 
                {
                    prev.next=temp.next;
                }
                prev=temp;
                temp = temp.next;
            }
        }
    }
	/**
	 * @param To write a each num in the file.
	 * @return
	 * @throws IOException
	 */
	public FileWriter writeListNode(FileWriter br) throws IOException 
	{
		// TODO Auto-generated method stub

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
                br.write(temp.data+" ");
                temp = temp.next;
            }
        }
        return br;
	}

	/*public int search(char num) {
		// TODO Auto-generated method stub
		int count=0;
        Node temp = head;
            while(temp!=null) {
                if(temp.data.equals(num)){
                   count++;
                }   
                temp = temp.next;
            }
        return count; 

	*/

	/*public void remove(char num)
	{
		// TODO Auto-generated method stub
		if(head.data.equals(num))
		{
			
			head = head.next;
			
		}
		else
		{
			Node prev=null;
			Node temp = head.next;
			while(!temp.data.equals(num)){
				prev =temp;
				temp = temp.next;
			}
			prev.next=temp.next;
			temp=null;
		}
		
	}*/

	public void InsertRightPosition(String num) 
	{
		// TODO Auto-generated method stub
		//int val = (int) head.data;
		if(num.compareTo((String)head.data)<0) {
			
			Node temp = new Node(num);
			temp.next =head;
			head=temp;
		}
		else {
			boolean flag = true;
			Node prev=head;
			Node temp=head.next;
			while(temp!=null) {
				
				if(num.compareTo((String)head.data)>0) {
			
					prev=temp;
					temp=temp.next;
				}
				else {
			
					Node newNode = new Node(num);
					newNode.next=temp;
					prev.next=newNode;
					flag=false;
					break;
				}
			}
			if(flag) {
				Node temp1 = head;
				while(temp1.next!=null) {
					temp1 = temp1.next;
				}
				temp1.next =new Node(num); 
			}
		}
	}
 }