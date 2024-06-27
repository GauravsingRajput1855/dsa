package functions;

import java.util.Scanner;

public class StackMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arrey size ");
		Stacks s=new Stacks(sc.nextInt());
		boolean exit=false;
		try
		{
			
		while(!exit)
		{
			System.out.println("push");
			System.out.println("display");
			switch(sc.nextInt())
			{
			case 1	:
				System.out.println("enter value to push");
				int val=sc.nextInt();
				s.push(val);
				System.out.println(val);
			
				break;
			case 2:
				s.display();				
				break;
			case 3:
				s.pop();	
				break;
			case 4:
				System.out.println(s.peek());
				break;
				
			}
			
			
		}
			
		}catch (Exception e)
		{
			e.printStackTrace();		
			}
		
	
	}
}