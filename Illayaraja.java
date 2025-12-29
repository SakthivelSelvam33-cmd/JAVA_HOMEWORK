import java.util.Scanner;
class Illayaraja
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
			System.out.println("1.Oru Kili Uruguthu");
			System.out.println("2.Kuzhaloodhum kannanukku");
			System.out.println("3.Ennai Thottu");
			System.out.println("4.Raja Raja Cholan");
			System.out.println("Enter your Song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Oru Kili Uruguthu");
			}
			else if(choice==2)
			{
				System.out.println("2.Kuzhaloodhum kannanukku");
			}
			else if(choice==3)
			{
				System.out.println("3.Ennai Tottu");
			}
			else if(choice==4)
			{
				System.out.println("4.Raja Raja Cholan");
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
			System.out.println("1.Ooruvittu Ooruvanthu");
			System.out.println("2.Nooru Varusham");
			System.out.println("3.Aasai Nooruvagai");
			System.out.println("4.Aasai Athigam Vachu");
			System.out.println("Enter your choice:");
			
			int choice=sc.nextInt();
			 if(choice==1)
			{
				System.out.println("1.Ooruvittu Ooruvanthu");
			}
			else if(choice==2)
			{
				System.out.println("2.Nooru Varusham");
			}
			else if(choice==3)
			{
				System.out.println("3.Aasai Nooruvagai");
			}
			else if(choice==4)
			{
				System.out.println("4.Aasai Athigam Vachu");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
			
			
			
			
		
			else if(option==3)
		{
			System.out.println("Sad Song");
			System.out.println("1.Kanne Kalaimane");
			System.out.println("2.Kanne Kalaimane");
			System.out.println("3.Paadi Parantha Killi");
			System.out.println("4.Nilave vaa");
			
			System.out.println("Enter your song type:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Kanne Kalaimane");
			}
			else if(choice==2)
			{
				System.out.println("2.Kanne Kalaimane");
			}
			else if(choice==3)
			{
				System.out.println("3.Paadi Parantha Killi");
			}
			else if(choice==4)
			{
				System.out.println("4.Nilave vaa");
			}
			
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
	}
}

	
		
				
				
				
				
				
				
				
			


