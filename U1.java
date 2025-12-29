
import java.util.Scanner;
class U1
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
			System.out.println("1.Aathdi Manasudhan");
			System.out.println("2.Chinna Sirisu");
			System.out.println("3.Venmeggam");
			System.out.println("4.Iayayyo");
			System.out.println("Enter your Song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Aathdi Manasudhan");
			}
			else if(choice==2)
			{
				System.out.println("2.Chinna Sirisu");
			}
			else if(choice==3)
			{
				System.out.println("3.Venmeggam");
			}
			else if(choice==4)
			{
				System.out.println("4.Iayayyo");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
		
		else if(option==2)
		{
			System.out.println("Kuthu Song");
			System.out.println("1.Machi Open The Bottle");
			System.out.println("2.Sarja Saman Nikalo");
			System.out.println("3.No money no honey");
			System.out.println("4.Villaiyadu Mankatha");
			System.out.println("Enter your choice:");
			
			int choice=sc.nextInt();
			 if(choice==1)
			{
				System.out.println("1.Machi Open The Bottle");
			}
			else if(choice==2)
			{
				System.out.println("2.Sarja Saman Nikalo");
			}
			else if(choice==3)
			{
				System.out.println("3.No money no honey");
			}
			else if(choice==4)
			{
				System.out.println("4.Villaiyadu Mankatha");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
			
			else if(option==3)
		{
			System.out.println("Motivational Song");
			System.out.println("1.Edhirthu Nill");
			System.out.println("2.Orru nalil");
			System.out.println("3.Nimirinthi Nil");
			System.out.println("4.Ungakkule Mirugam");
			System.out.println("Enter your song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Edhirthu Nill");
			}
			else if(choice==2)
			{
				System.out.println("2.Orru nalil");
			}
			else if(choice==3)
			{
				System.out.println("3.Nimirinthi Nil");
			}
			else if(choice==4)
			{
				System.out.println("4.Ungakkule Mirugam");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
		
			else if(option==4)
		{
			System.out.println("Sad Song");
			System.out.println("1.Kadhal Valarthan");
			System.out.println("2.Yedho ondru ennai");
			System.out.println("3.Pogadhe");
			System.out.println("4.Ninaithu Ninaithu");
			
			System.out.println("Enter your song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Kadhal Valarthan");
			}
			else if(choice==2)
			{
				System.out.println("2.Yedho ondru ennai");
			}
			else if(choice==3)
			{
				System.out.println("3.Pogadhe");
			}
			else if(choice==4)
			{
				System.out.println("4.Ninaithu Ninaithu");
			}
			
			else 
			{
				System.out.println("This Song Not Found");
			}
			
		}
	}
}

	
		
				
				
				
				
				
				
				
			


