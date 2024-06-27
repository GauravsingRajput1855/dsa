package com.app.all;

public class DoublyLinklist {
	//node class
	static class Node{
	//node class fields
		private int data;
		private Node next;
		private Node prev;
		//node class methods
		public Node()
		{
			data=0;
			next=null;
			prev=null;
		}
		public Node(int val)
		{
			data=val;
			next=null;
			prev=null;
		}
	}
	//list class methods
	private Node head;
	public DoublyLinklist(){
		head=null;	
	}
	
//------------------------------------------------------------------------
	public void displayForward()
	{
		System.out.println("forward list is ");
		Node trav=head;
		while(trav!=null)
		{
			System.out.print(trav.data+"--> ");
			trav=trav.next;
		}
	}
//------------------------------------------------------------------------
	public void displayReverse()
	{
		System.out.println("reverse list is ");
		//for empty list
		if(head==null)
			return;
		//step 1 traverse till last node 
		Node trav=head;
		while(trav.next!=null)
		{
			trav=trav.next;
		}
		//print in reverse order
		while(trav!=null)
		{
			System.out.print(trav.data+"-->");
			trav=trav.prev;
		}	
	}
//------------------------------------------------------------------------
	public void addFirst(int val)
	{
		Node newNode=new Node(val);

		if(head==null) {
			head=newNode;
		}
		else
		{
			newNode.next=head;
			//only new is 
			head.prev=newNode;
			head=newNode;
		}
	}
//------------------------------------------------------------------------
	public void addLast(int val)
	{
		Node newNode=new Node(val);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			Node trav=head;
			
			while(trav.next!=null)
			{
				trav=trav.next;
				
			}
			trav.next=newNode;
			newNode.prev=trav;
		}
	}
//------------------------------------------------------------------------
	 public void addAtPosition(int val,int pos)
	 {
		 if(head==null||pos<=1)
			 addFirst(val);
		 else {
			 Node newNode=new Node(val);
			 Node trav=head,temp;
			 for(int i=1;i<pos-1;i++)
			 {
				 if(trav.next==null)
					 break;
				 trav=trav.next;
			 }
			 //take temp pointer to node after traverse
			 temp=trav.next;
			 //newnodes next should point to temp
			 newNode.next=temp;
			 //new node previous point to trav
			 newNode.prev=trav;
			 //travs next should point to newnode
			 trav.next=newNode;
			 //temps previous poiny newnode
			 temp.prev=newNode;
			 
			 
			 //special case
			 if (temp!=null)
			 {
				 temp.prev=newNode;
			 }
		 }
	 }
//------------------------------------------------------------------------
	 public void delFirst()
	 {
		 //--
		 if(head==null)
			 throw new RuntimeException("list is empty");
		 //--
		 //if single element in list
		 if(head.next==null)
			 head=null;
		 else {
			 //--
			 head=head.next;
			 //--
			 head.prev=null;
		 }
		
		
	 }
//------------------------------------------------------------------------
	 public void delatPos(int pos)
	 {
		 //no need of temporary pointer here 
		 if(pos==1)
			 delFirst();
		 //--
		 if(head==null||pos<1)
			 throw new RuntimeException("list is empty");
		 
		 Node trav=head;
		for(int i=1;i<pos;i++)
		{
			if(trav==null)
				 throw new RuntimeException("list is empty");
			trav=trav.next;

		}
		trav.prev.next=trav.next;
		trav.next.prev=trav.prev;
		
	 }
//------------------------------------------------------------------------
	 public void dellast()
	 {
		 if(head==null)
			 throw new RuntimeException("list is empty");

		 if(head.next==null)
			 head=null;
		 
		 Node temp=null;
		 Node trav=head;
		 while(trav.next!=null)
		 {
			 trav=trav.next;
		 }
		 trav.prev.next=null;	 
	 }
	
//------------------------------------------------------------------------ 
	 public void displayAlternate() {
	        Node current = head;
	        int counter = 0;
	        while (current != null) {
	            if (counter % 2 == 0) {
	                System.out.print(current.data + " ");
	            }
	            counter++;
	            current = current.next;
	        }
	        System.out.println();
	    }
//------------------------------------------------------------------------

	 public void replaceByValue(int oldValue, int newValue) {
	        Node current = head;
	        while (current != null) {
	            if (current.data == oldValue) {
	                current.data = newValue;
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Value " + oldValue + " not found in the list.");
	    }
	

}
