package inheritance;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Unique Identification number : ");
		int ui = sc.nextInt();
		System.out.println("Enter title : ");
		String t = sc.next();
		System.out.println("Enter No.of copies : ");
		int no = sc.nextInt();
		System.out.println("Press 1 :  WrittenItem \n      2 :  MediaItem");
		int choice = sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter author name : ");
			String aname = sc.next();
			System.out.println("Press 1 : If it is a Book \nPress 2 : If it is a journalPaper ");
			int choice1 = sc.nextInt();
			if(choice1 == 1)
			{
				WrittenItem bi = new Book(ui,t,no,aname);
				
					
		
				System.out.println("Press 1  : To Check-in  \nPress 2 : To Check-out\nPress 3 : To display info ");
				int ch2 = sc.nextInt();
				if(ch2==1)
				{
					bi.addItem(ui, t, no);
					Item.ai.add(bi);
					System.out.println("INFO ABOUT BOOK AFTER CHECK-IN : ");
					System.out.println(Item.ai);
				}
				else if(ch2==2)
				{
					bi.checkOut(ui);
					System.out.println("INFO ABOUT BOOK AFTER CHECK-OUT : ");
					System.out.println(Item.ai);
					
				}
				else if(ch2==3)
				{
					System.out.println("INFO ABOUT BOOK: ");
					bi.print();
				}
				else
				{
					System.out.println("Enter valid choice");
				}
				
			}
			else if(choice1 == 2)
			{
				System.out.println("Enter Published Year : ");
				String yr = sc.next();
				WrittenItem ji = new JournalPaper(ui,t,no,aname,yr);
				System.out.println("Press 1  : To Check-in  \nPress 2 : To Check-out\nPress 3 : To display info ");
				int ch2 = sc.nextInt();
				if(ch2==1)
				{
					ji.addItem(ui, t, no);
					Item.ai.add(ji);
					System.out.println("INFO ABOUT JOURNAL PAPER AFTER CHECK-IN : ");
					System.out.println(Item.ai);
				}
				else if(ch2==2)
				{
					ji.checkOut(ui);
					System.out.println("INFO ABOUT JOURNAL PAPER AFTER CHECK-OUT : ");
					System.out.println(Item.ai);
					
				}
				else if(ch2==3)
				{
					System.out.println("INFO ABOUT JOURNAL PAPER: ");
					ji.print();
				}
				else
				{
					System.out.println("Enter valid choice");
				}
				
			}
			else
			{
				System.out.println("Enter valid choice");
			}
		}
		else if(choice==2)
		{
			System.out.println("Enter Runtime: ");
			int rt = sc.nextInt();
			System.out.println("Press 1 : If it is a Video \nPress 2 : If it is a CD ");
			int choice1 = sc.nextInt();
			if(choice1==1)
			{
				System.out.println("Enter Director: ");
				String dname = sc.next();
				System.out.println("Enter Genre: ");
				String g = sc.next();
				System.out.println("Enter Year: ");
				int y = sc.nextInt();
				MediaItem mi = new Video(ui,t,no,rt,dname,g,y);
				
				System.out.println("Press 1  : To Check-in  \nPress 2 : To Check-out\nPress 3 : To display info ");
				int ch2 = sc.nextInt();
				if(ch2==1)
				{
					mi.addItem(ui, t, no);
					Item.ai.add(mi);
					System.out.println("INFO ABOUT VIDEO AFTER CHECK-IN : ");
					System.out.println(Item.ai);
				}
				else if(ch2==2)
				{
					mi.checkOut(ui);
					System.out.println("INFO ABOUT VIDEO AFTER CHECK-OUT : ");
					System.out.println(Item.ai);
					
				}
				else if(ch2==3)
				{
					System.out.println("INFO ABOUT VIDEO: ");
					mi.print();
				}
				else
				{
					System.out.println("Enter valid choice");
				}
				
			}
			else if(choice1==2)
			{
				System.out.println("Enter Artist: ");
				String art = sc.next();
				System.out.println("Enter Genre: ");
				String gen = sc.next();
				MediaItem cdi = new CD(ui,t,no,rt,art,gen);
				
				System.out.println("Press 1  : To Check-in  \nPress 2 : To Check-out\nPress 3 : To display info ");
				int ch2 = sc.nextInt();
				if(ch2==1)
				{
					cdi.addItem(ui, t, no);
					Item.ai.add(cdi);
					System.out.println("INFO ABOUT CD AFTER CHECK-IN : ");
					System.out.println(Item.ai);
				}
				else if(ch2==2)
				{
					cdi.checkOut(ui);
					System.out.println("INFO ABOUT CD AFTER CHECK-OUT : ");
					System.out.println(Item.ai);
					
				}
				else if(ch2==3)
				{
					System.out.println("INFO ABOUT CD: ");
					cdi.print();
				}
				else
				{
					System.out.println("Enter valid choice");
				}
				
			}
			else
			{
				System.out.println("Enter valid choice");
			}
			
		}
		else
		{
			System.out.println("Enter valid choice");
		}
		sc.close();
		
	}

}
