package fuction_tester;

import java.security.KeyStore.SecretKeyEntry;
import java.util.HashSet;

public class Linklist {
	static class Node{
		private int data;
		private Node next;
		
		//default constructor
		public Node()
		{
			data=0;
			next=null;
		}
		//parameterized constructor
		public Node(int val)
		{
			data=val;
			next=null;
		}
	}
//-------------------------------------------------------------------
	private Node head;
	//linked list class constructor
	public Linklist()
	{
		head=null;
	}

//-------------------------------------------------------------------
	public void display()
	{
		System.out.println("your list now = ");
		Node trav=head;
		while(trav!=null)
		{
			System.out.print(" -- > "+trav.data );
			trav=trav.next;
		}
	}
//-------------------------------------------------------------------
	public void addFirst(int val)
	{
		Node newNode=new Node(val);
		newNode.next=head;
		head=newNode;
			
	}
//-------------------------------------------------------------------
	public void addLast(int val)
	{
		Node newNode=new Node(val);
		Node trav=head;
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			while(trav!=null)
			{
				trav=trav.next;
			}
			
		}
		trav.next=newNode;
	}
//-------------------------------------------------------------------
	public void delLast()
	{
		if(head==null)
			throw new RuntimeException("list is empty");
		if(head.next==null)
		{
			head=null;
		}
		Node temp = null;
		Node trav=head;
		
		while(trav.next!=null)
		{
			temp=trav;
			trav=trav.next;
		}
		temp.next=null;
			
	}
//--------------------------------------------------------------------
	public void delFirst()
	{
		if(head==null)
			throw new RuntimeException("list is empty");
		head=head.next;
	}
//--------------------------------------------------------------------
	public void delAll()
	{
		head=null;
	}
	
//--------------------------------------------------------------------
	public void addatPosition(int val ,int pos)
	{
		Node newNode= new Node(val);
		if(head==null||pos<=1)
			addFirst(val);
		Node trav=head;
		for(int i=1;i<pos-1;i++)
			trav=trav.next;
		
		newNode.next=trav.next;
		trav.next=newNode;
	}
//--------------------------------------------------------------------
	public void delatPosition(int pos)
	{
		Node temp=null ,trav=head;
		//special case 1
		if(pos==0)
		{
			head=head.next;
			return;
		}
		//special case 2
		if(head.next==null)
			head=null;
		//special case 3
		if(head==null)
			throw new RuntimeException("list is empty");
		//special case 4
		if(head==null||pos<0)
			throw new RuntimeException("list is empty or invaloid position");
		
		for(int i=0;i<pos;i++)
		{
			temp=trav;
			trav=trav.next;
			
		}
		temp.next=trav.next;
	
		
	}
//-----------------------------------------------------------------------	
	public void selectionsort()
	{
		Node i,j;
		for(i=head; i !=null;i=i.next)
		{
			for(j=i.next;j!=null;j=j.next)
			{
				if(i.data>j.data)
				{
				int temp=i.data;
				i.data=j.data;
				j.data=temp;
				}
			}System.out.println(i.data);
		}
	}
	
//-----------------------------------------------------------------------	
	public boolean linearsearch(int key)
	{
		Node i;
		for(i=head;i!=null;i=i.next)
		{
			if(i.data==key)
			{
				return true;
			}
		}
		return false;
	}
//-----------------------------------------------------------------------	
	
	public int findindex(int key)
	{
		Node trav=head;
		int index=0;
		while(trav!=null)
		{
			if(trav.data==key)
			{
				return index;
			}
			trav=trav.next;
			index++;
		}
		return -1;
		
	}
//-----------------------------------------------------------------------	
	public void reverselist()
	{
		Node temp=null;
		Node oldNode=head;
		head=null;
		
		while(oldNode!=null)
		{
			Node nextNode=oldNode.next;
			oldNode.next=temp;
			temp=oldNode;
			oldNode=nextNode;
		}
		head=temp;
	}
//-----------------------------------------------------------------------	
	public int minimum()
	{
		if(head==null)
			throw new RuntimeException("list is empty");
		
		int min=head.data;
		Node trav=head.next;
		while(trav!=null)
		{
			if(trav.data<min)
			{
				min=trav.data;
			}
			trav=trav.next;
		}
		return min;
	}
	
//-----------------------------------------------------------------------	
	public int maximum()
	{
		if(head==null)
		throw new RuntimeException("list is empty");
		
		int max=head.data;
		Node trav=head.next;
		while(trav!=null)
		{
			if(trav.data>max)
			{
				max=trav.data;
			}
			trav=trav.next;
		}
		return max;
		
	}
//-----------------------------------------------------------------------	
	
	public void  removeduplicates()
	{
		if(head==null)
			throw new RuntimeException("list is empty");
		HashSet<Integer>seen= new HashSet<>();
		Node trav=head;
		Node temp=null;
		
		while(trav!=null)
		{
			if(seen.contains(trav.data))
			{
				temp.next=trav.next;
			}
			else {
				seen.add(trav.data);
				temp=trav;
			}
			trav=trav.next;
		}

	}
//-----------------------------------------------------------------------	
	
	
	
	
	
	
}
