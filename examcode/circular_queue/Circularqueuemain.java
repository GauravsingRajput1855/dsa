package com.app.queuq;

import java.util.Scanner;

public class Circularqueuemain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		CircularQueue cq=new CircularQueue(size);
		boolean exit=false;
		while(!exit)
		{
			System.out.println("1 for push");
			System.out.println("2 for pop");
			System.out.println("3 ready made list");
			System.out.println("4 display");
			System.out.println("5 peek");
			try {
				switch(sc.nextInt())
				{
				case 1:
					System.out.println("enter the value for push");
					int val=sc.nextInt();
					cq.push(val);
					break;
				case 2:
					cq.pop();
					break;
				case 3:
					cq.push(10);
					cq.push(20);
					cq.push(30);
					cq.push(40);
					cq.push(50);
					cq.push(60);;
					break;
				case 4:
					cq.display();
					break;
				case 5:
					cq.peek();
					break;
				}
				
				
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
