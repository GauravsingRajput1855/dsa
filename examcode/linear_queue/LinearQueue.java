package com.app.all;

public class LinearQueue {
	private int []arr;
	private int rare,front,capacity;
	
	public LinearQueue(int size)
	{
		arr=new int[size];
		capacity=size;
		rare=-1;
		front=-1;
	}
//-----------------------------------------------------------------------
	
	public boolean isFull()
	{
		return rare==arr.length-1;//or rate=capacity-1
		
	}
//-----------------------------------------------------------------------
	public boolean isEmpty()
	{
		return rare==front;//or front== -1
		
	}
//-----------------------------------------------------------------------
	public void push(int val)
	{
		if(isFull())
			throw new RuntimeException("queue is full");
		rare++;
		arr[rare]=val;
	}
//-----------------------------------------------------------------------
	public int pop()
	{
		if(isEmpty())
			throw new RuntimeException("queue is empty");
		
		int item=arr[front];
		if(front>=rare)
		{
			front=-1;
			rare=-1;
		}else
		{
			front++;
		}
		return item;
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
			throw new RuntimeException("list is empty");
		return arr[rare];
	}
	

	
}
