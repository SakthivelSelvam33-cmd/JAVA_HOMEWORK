import java.util.Scanner;
class HarishJeyaraj
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Song type:");
		System.out.println("1.Melody");
		System.out.println("2.Kuthu");
		System.out.println("3.Sad");
		System.out.print("Enter your option:");
		
		int option=sc.nextInt();
		
		
		if(option==1)
		{
			System.out.println("Melody Song");
			System.out.println("1.Unnale");
			System.out.println("2.Annul Maelae");
			System.out.println("3.Yedho Ondru");
			System.out.println("4.Paartha Mudhal");
			System.out.println("5.Vaseegara");
			System.out.println("Enter your Song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Unnale");
			}
			else if(choice==2)
			{
				System.out.println("2.Annul Maelae");
			}
			else if(choice==3)
			{
				System.out.println("3.Yedho Ondru");
			}
			else if(choice==4)
			{
				System.out.println("4.Paartha Mudhal");
			}
			else if(choice==5)
			{
				System.out.println("4.Vaseegara");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
		
		else if(option==2)
		{
			System.out.println("Kuthu Song");
			System.out.println("1.Tirunelveli Halwa Da");
			System.out.println("2.Aradi Katre");
			System.out.println("3.Soda Bottle");
			System.out.println("4.Aruva Meesai");
			System.out.println("Enter your choice:");
			
			int choice=sc.nextInt();
			 if(choice==1)
			{
				System.out.println("1.Tirunelveli Halwa Da");
			}
			else if(choice==2)
			{
				System.out.println("2.Aradi Katre");
			}
			else if(choice==3)
			{
				System.out.println("3.Soda Bottle");
			}
			else if(choice==4)
			{
				System.out.println("4.Aruva Meesai");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
			
			
			
		
			else if(option==3)
		{
			System.out.println("Sad Song");
			System.out.println("1.Venmathiye");
			System.out.println("2.oh maname");
			System.out.println("3.Yamma Yamma");
			System.out.println("4.Othayile");
			
			System.out.println("Enter your song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Venmathiye");
			}
			else if(choice==2)
			{
				System.out.println("2.oh maname");
			}
			else if(choice==3)
			{
				System.out.println("3.Yamma Yamma");
			}
			else if(choice==4)
			{
				System.out.println("4.Othayile");
			}
			
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
	}
}

	
		
				
				
				
				
				
				
				
			


