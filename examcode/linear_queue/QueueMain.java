package com.app.all;

import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) {
		System.out.println("eneter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		LinearQueue q=new LinearQueue(size);
		boolean exit=false;
		while(!exit)
		{
			System.out.println("1 - for ready made list");
			System.out.println("2 - display");
			System.out.println("3 - pop");
			System.out.println("4 - peek");
			try {
				switch(sc.nextInt())
				{
				case 1:
					q.push(10);
					q.push(20);
					q.push(30);
					q.push(40);
					q.push(50);
					q.push(60);
					break;
				case 2:
					q.display();
					break;
				case 3:
					q.pop();
					break;
				case 4:
					System.out.println(q.peek());
					break;
				case 5:
					System.out.println("enter the element");
					int val=sc.nextInt();
					q.push(val);
					break;
				case 6:
					break;
				}
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("you have an error"+e);
			}
		}
		
	}

}
