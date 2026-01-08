import java.util.Scanner;
class Registration
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    //System.out.println("Enter the Integer value:");
		//int total=sc.nextInt();
		System.out.println("Enter the String value");
		String username[]=new String[10];
		String password[]=new String[10];
		int count=0;
		int choice;
		do
		{
			System.out.println("select your value:");
			System.out.println("1.Registration");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
				if(count<username.length)
				{
					//System.out.println("Enter the username and password");
					System.out.println("Enter the username ");
					username[count]=sc.nextLine();
					//System.out.println(username[count]);
					
					
					System.out.println("Enter the password");
					password[count]=sc.nextLine();
					
					System.out.println("Registration successfully");
					count++;
					
				}
				else
				{
					System.out.println("Registration is not valid");
				}
				break;
				case 2:
				
					System.out.print("Enter the loginpage:");
					String loginuser=sc.nextLine();
					System.out.print("Enter the password:");
					String loginpasswords=sc.nextLine();
					
					boolean isvalid=false;
					
					for(int i=0;i<count;i++)
						if(username[i].equals(loginuser)&& password[i].equals(loginpasswords))
						{
							isvalid=true;
							count++;
						}
						if(isvalid)
						{
							System.out.println("Registration sucessfully");
						}
						else
						{
							System.out.println("Invalid username and password");
						}
						break;
						case 3:
						System.out.println("Exit the program");
						break;
						default:
						System.out.println("Not a registration");
			}
		}while(choice!=3);
	}
}
							
							
					
				
					
					
		
		
