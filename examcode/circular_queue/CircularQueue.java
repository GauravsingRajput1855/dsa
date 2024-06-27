package com.app.queuq;

public class CircularQueue {
	private int[]arr;
	private int rare,front,count=0;
	public CircularQueue(int size)
	{
		arr=new int[size];
		rare=-1;
		front=-1;
		
	}
//-----------------------------------------------------------------------
	public boolean isFull()
	{
		return (front==-1 && rare==arr.length-1)||(front==rare&&front!= -1);
	}
//-----------------------------------------------------------------------

	public boolean isEmpty()
	{
		return (front==rare && front == -1);
	}
//-----------------------------------------------------------------------
	public void push(int val)
	{
		if(isFull())
			throw new RuntimeException("queue is full");
		
		rare=(rare+1)%arr.length;
		arr[rare]=val;
	}
//-----------------------------------------------------------------------
	public void pop()
	{
//		
//		 int item = arr[front];
//	        front = (front + 1) % capacity;
//	        count--;
//	        return item;
//		
		
		
		if(isEmpty())
			throw new RuntimeException("queue is empty");
		
		front=(front+1)%arr.length;
		if(front==rare)
		{
			front=-1;
			rare=-1;
		}
	}
//-----------------------------------------------------------------------
	public void display()
	{
		for(int i=0;i<=rare;i++)
		{
			System.out.println(arr[i]);
		}
	}
//-----------------------------------------------------------------------
	public int peek()
	{
		if(isEmpty())
		 throw new RuntimeException("queue is empty");
		int index=(front +1)%arr.length;
		return arr[index];
	}


}
