import java.util.Scanner;
class ARRahman
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
			System.out.println("1.Netru illadha Matram");
			System.out.println("2.Enna Solla Pogirai");
			System.ou.prinln("3.Ennavalae adi Ennavalae");
			System.out.println("4.Malargalae Malargale");
			System.out.println("Enter your choice:");
			
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("1.Netru illadha Matram");
			}
			else if(choice==2)
			{
				System.out.println("2.Enna Solla Pogirai");
			}
			else if(choice==3)
			{
				System.ou.prinln("3.Ennavalae adi Ennavalae");
			}
			else if(choice==4)
			{
				System.out.println("4.Malargalae Malargale");
			}
			else 
			{
				System.out.println("This Song Not Found");
			}
		}
	}
}
				
				
				
				
				
				
				
			


