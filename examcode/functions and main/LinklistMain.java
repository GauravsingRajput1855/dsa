package linkList;
import java.util.Scanner;
public class LinklistMain {
	public static void main(String[] args) {
		int val=0,pos;
		SinglyLinklist list=new SinglyLinklist();
		boolean exit=false;
		try(Scanner sc=new Scanner(System.in))
		{
			while(!exit)
			{
				try {
				System.out.println("1 add first");
				System.out.println("2 add last");
				System.out.println("3 add at position");
				System.out.println("4 delete first");
				System.out.println("5 delete last");
				System.out.println("6 delete at position");
				System.out.println("7 delete all");
				System.out.println("8 display");
				System.out.println("9 exit");
				System.out.println("10 readymade list");
				System.out.println("11 selection sort");
				System.out.println("12 reverse");
				System.out.println("13 find key");
				System.out.println("Enter choice : ");
				System.out.println("pls enter two times....");
				
				
				switch (sc.nextInt()) 
				{
				case 1:
					System.out.println("add element");
					 val= sc.nextInt();
		
					list.addFirst(val);
					break;
				case 2:
					System.out.println("add last");
					 val =sc.nextInt();
					 list.addLast(val);
					
					break;
				case 3:
					System.out.println("enter element");
					val=sc.nextInt();
					System.out.println("enetr position");
					pos=sc.nextInt();
					list.addAtPos(val, pos);
					System.out.println();
					break;
				case 4:
					System.out.println("delette first");
					try {
						list.delFirst();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 5:
					System.out.println("delete last");
					try {
						list.addLast(val);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				case 6:
					System.out.println("enter position");
					pos=sc.nextInt();
					list.delAtPos(pos);
					break;
				case 7:
					list.deleteAll();
					break;
				case 8:
					list.display();
					break;
				case 9:
					exit=true;
					break;
				case 10:
					System.out.println("ready made list");
					list.addFirst(20);
					list.addFirst(10);
					list.addFirst(50);
					list.addFirst(30);
					break;
				case 11:
					list.selectionSort();
					break;
				case 12:
					list.reverseList();
					break;
				case 13:
					System.out.println("enter key");
					int key=sc.nextInt();
				System.out.println(list.linerSearch(key));	
					break;
				
				default:
					break;
				}
				}catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}
}
