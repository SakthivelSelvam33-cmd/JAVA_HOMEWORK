import java.util.Scanner;
class Anirudh
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Song type:");
		System.out.println("1.Melody");
		System.out.println("2.Kuthu");
		System.out.println("3.Motivational Song");
		System.out.println("4.Sad");
		System.out.print("Enter your option:");
		
		int option=sc.nextInt();
		
		
		if(option==1)
		{
			System.out.println("Melody Song");
			System.out.println("1.Neeyum Nannum Anbae");
			System.out.println("2.velicha pove");
			System.out.println("3.po Indru neeyaga");
			System.out.println("4.Nee Partha Vizhigal");
			System.out.println("Enter your Song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Neeyum Nannum Anbae");
			}
			else if(choice==2)
			{
				System.out.println("2.velicha pove");
			}
			else if(choice==3)
			{
				System.out.println("3.po Indru neeyaga");
			}
			else if(choice==4)
			{
				System.out.println("4.Nee Partha Vizhigal");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
		
		else if(option==2)
		{
			System.out.println("Kuthu Song");
			System.out.println("1.Vaathi Raid");
			System.out.println("2.Naa Ready");
			System.out.println("3.Badass");
			System.out.println("4.Vandha Edam");
			System.out.println("Enter your choice:");
			
			int choice=sc.nextInt();
			 if(choice==1)
			{
				System.out.println("1.Vaathi Raid");
			}
			else if(choice==2)
			{
				System.out.println("2.Naa Ready");
			}
			else if(choice==3)
			{
				System.out.println("3.Badass");
			}
			else if(choice==4)
			{
				System.out.println("4.Vandha Edam");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
			
			else if(option==3)
		{
			System.out.println("Motivational Song");
			System.out.println("1.Vellai illa Pattadhari");
			System.out.println("2.Boomi enna Suthudhe");
			System.out.println("3.Ethir Neechal");
			System.out.println("4.Surviva");
			System.out.println("Enter your song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Vellai illa Pattadhari");
			}
			else if(choice==2)
			{
				System.out.println("2.Boomi enna Suthudhe");
			}
			else if(choice==3)
			{
				System.out.println("3.Ethir Neechal");
			}
			else if(choice==4)
			{
				System.out.println("4.Surviva");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
		
			else if(option==4)
		{
			System.out.println("Sad Song");
			System.out.println("1.Porkanda Singam");
			System.out.println("2.Kanave Kanave");
			System.out.println("3.Kannaana kanne");
			System.out.println("4.Jodi Nilave");
			
			System.out.println("Enter your song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Porkanda Singam");
			}
			else if(choice==2)
			{
				System.out.println("2.Kanave Kanave");
			}
			else if(choice==3)
			{
				System.out.println("3.Kannaana kanne");
			}
			else if(choice==4)
			{
				System.out.println("4.Jodi Nilave");
			}
			
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
	}
}

	
		
				
				
				
				
				
				
				
			


