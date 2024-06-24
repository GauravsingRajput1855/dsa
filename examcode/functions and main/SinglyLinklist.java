package linkList;


public class SinglyLinklist {
	
	static class Node{
		private int data;
		private Node next;
		
		public Node() {
			data=0;
			next=null;
			
		}
		public Node(int val)
		{
			data=val;
			next=null;
			
		}	
	}
	//----------------------------------------------------------------------------------
	private Node head;
	public SinglyLinklist()
	{
		head=null;
	}
	//----------------------------------------------------------------------------------
	public void display() {
		System.out.println("list is ");
		Node trav=head;
		while(trav!=null)
		{
			System.out.print(trav.data+"->");
			trav=trav.next;
		}
	  System.out.println("Null");
	}
	//-----------------------------------------------------------------------------------
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
			while(trav.next!=null)
			{
				trav=trav.next;
				
			}
			trav.next=newNode;
		}
	}
	//-------------------------------------------------------------------------------------------
	public void addFirst(int val)
	{
		Node newNode=new Node(val);
		newNode.next=head;
		head=newNode;
	}
	//-------------------------------------------------------------------------------------------
	public void addAtPos(int val,int pos)
	{
		Node newNode=new Node(val);
		if(head==null||pos<=1)
			addFirst(val);
		Node trav=head;
		for(int i=1;i<pos-1;i++)
			trav=trav.next;
		
		newNode.next=trav.next;
		trav.next=newNode;
	}
	//--------------------------------------------------------------------------------------------
	public void delFirst() {
		if(head==null)
			throw new RuntimeException("list is empty");
		head=head.next;
	}
	//--------------------------------------------------------------------------------------------
	public void deleteLast()
	{
		if(head==null)
			throw new RuntimeException("list is empty");
		//special case
		if(head.next==null)
			head=null;
		Node temp=null,trav=head;
		while(trav.next!=null)
		{
			temp=trav;
			trav=trav.next;
		}
		temp.next=null;
	}
	//---------------------------------------------------------------------------------------------
	
	public void delAtPos(int pos)
	{
		Node temp=null, trav=head;
		if(head==null)
			throw new RuntimeException("list is empty");
		if(head==null || pos<1)
			throw new RuntimeException("list is empty or invalid position ");
		for(int i=0;i<pos;i++)
		{
			temp=trav;
			trav=trav.next;
		}
		temp.next=trav.next;
	}
	//-------------------------------------------------------------------------------------------
	public void deleteAll()
	{
		head=null;
		
	}
	//-------------------------------------------------------------------------------------------
	//selection sort
	public void selectionSort()
	{
		Node i,j;
		for(i=head;i!=null;i=i.next)
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
	//----------------------------------------------------------------------------------------------
	public void reverseList()
	{
		Node temp = null;
		Node oldNode=head;
		head=null;
		while(oldNode!=null)
		{
			oldNode=oldNode.next;
			temp.next=head;
			head=temp;
		}
	}
	//----------------------------------------------------------------------------------------------
	public boolean linerSearch(int key)
	{
		Node i,j;
		
		for(i=head;i!=null;i=i.next)
		{
			for(j=i.next;j!=null;j=j.next)
			{
				if(i.data==key)
				{
					return true;
				}
			}
		}
		return false;
	}
	
}
