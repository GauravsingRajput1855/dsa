package functions;

public class Stacks {
	private int[]arr;
	private int top;
	
	public Stacks(int size)
	{
		arr=new int[size];
		top=-1;
	}
//-----------------------------------------------------------------------
	public boolean isFull()
	{
		return top==arr.length-1;
	}
//-----------------------------------------------------------------------	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
//-----------------------------------------------------------------------	

	public void push(int val)
	{
		if(isFull())
			throw new RuntimeException("array is full");
		
		top++;
		arr[top]=val;
	}
//-----------------------------------------------------------------------	
	public void pop()
	{
		if(isEmpty())
			throw new RuntimeException("array is empty");
		top--;
		
	}
//-----------------------------------------------------------------------
	public int peek()
	{
		return arr[top];
	}
	
//-----------------------------------------------------------------------
	public void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}
//-----------------------------------------------------------------------
	
	
	
	
}
