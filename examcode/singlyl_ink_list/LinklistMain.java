package fuction_tester;

import java.util.Scanner;

public class LinklistMain {
	public static void main(String[] args) {
		int val=0,pos = 0;
		Linklist list=new Linklist();
		boolean exit=false;
		try(Scanner sc=new Scanner(System.in))
		{
			while(!exit)
			{
				try {
					System.out.println();
					System.out.println("0 for exit ");
					System.out.println("1 for add ready made list");
					System.out.println("2 for display ");
					System.out.println("3 add at first position");
					System.out.println("4 addd at last position");
					System.out.println("5 delete first");
					System.out.println("6 delete last");
					System.out.println("7 delete at position");
					System.out.println("8 delete all");
					System.out.println("9 selection sort");
					System.out.println("10 find key true false");
					System.out.println("11 find key index");
					System.out.println("12 reverse the list");
					System.out.println("13 minimum no");
					System.out.println("14 maximum no ");
					System.out.println("15 remove duplicate");
					
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
						list.display();
						break;
					case 3:
						System.out.println("enter value u want to enter");
						val=sc.nextInt();
						list.addFirst(val);
						break;
					case 4:
						System.out.println("enter the value u want to add at the last");
						val=sc.nextInt();
						list.addLast(val);
						break;
					case 5:
						list.delFirst();
						break;
					case 6:
						list.delLast();
						break;
					case 7:
						System.out.println("enter position");
						pos=sc.nextInt();
						list.delatPosition( pos);
						break;
					case 8:
						list.delAll();
						System.out.println("all list is deleted ");
						break;
					case 9:
						System.out.println("output of selection sort is ");
						list.selectionsort();
						break;
					case 10:
						System.out.println("enter the key u want to search");
						int key=sc.nextInt();
						System.out.println(list.linearsearch(key)); 
						break;
					case 11:
						System.out.println("enter the key u want to search");
						int keys=sc.nextInt();
						System.out.println(list.findindex(keys));	
						break;
					case 12:
						System.out.println("reverse list is ");
						list.reverselist();
						break;
					case 13:
						System.out.println("minimum is");
						System.out.println(list.minimum());
						break;
					case 14:
						System.out.println("maximum is ");
						System.out.println(list.maximum());
						break;
					case 15:
						System.out.println("removing duplicates");
						list.removeduplicates();
						list.display();
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
