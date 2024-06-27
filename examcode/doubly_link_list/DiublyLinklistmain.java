package com.app.all;

import java.util.Scanner;


public class DiublyLinklistmain {
	public static void main(String[] args) {	
		int val=0,pos = 0;
		DoublyLinklist list=new DoublyLinklist();
		boolean exit=false;
		try(Scanner sc=new Scanner(System.in))
		{
			
			while(!exit)
			{
				System.out.println();
				System.out.println("1 for add first populated");
				System.out.println("2 for display");
				System.out.println("3 for add last");
				System.out.println("4 for add last populated");
				System.out.println("5 for add first");
				System.out.println("6 add at position");
				System.out.println("7 delete first");
				System.out.println("8 delete last");
				System.out.println("9 delete at position");
				try {
					System.out.println();	
					switch(sc.nextInt())
					{
					case 1:
						list.addFirst(40);
						list.addFirst(20);
						list.addFirst(50);
						list.addFirst(30);
						list.addFirst(10);
						break;
					case 2:
						System.out.println("forward list is ");
						list.displayForward();
						list.displayReverse();
						break;
					case 3:
						System.out.println("enter value to add last");
						int vals=sc.nextInt();
						list.addLast(vals);
						break;
					case 4:
						list.addLast(20);
						list.addLast(30);
						list.addLast(40);
						list.addLast(50);
						list.addLast(60);

						break;
					case 5:
						System.out.println("enter at first");
						int add=sc.nextInt();
						list.addFirst(add);
						break;
					case 6:
						System.out.println("enter value");
						int valu=sc.nextInt();
						System.out.println("enter position");
						int poss=sc.nextInt();
						list.addAtPosition(valu, poss);
						break;
					case 7:
						list.delFirst();
						System.out.println("first deleted");
						break;
					case 8:
						list.dellast();
						System.out.println("last deleted");
						break;
					case 9:
						System.out.println("enter the position u want to delete");
						int posss=sc.nextInt();
						list.delatPos(posss);
						break;
					case 10:
						exit=true;
						break;
					case 11:
							
						break;
					case 12:
						
						break;
					case 13:
						
						break;
					case 14:
						
						break;
					case 15:
						
						break;
					case 0:
						exit=true;
						break;
					}
					
					
					
					
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println("come in switch case to find error");
				}
			}
		}
		
		
	}

}
