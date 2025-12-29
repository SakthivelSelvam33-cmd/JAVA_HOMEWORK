import java.util.Scanner;
class RailwayTicket
{
	public static void main(String[] args)
	{
		System.out.println("Enter your seattype");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("General");
				System.out.println("price=100");
				break;
			}
			case 2:
			{
				System.out.println("Sleeper");
				System.out.println("price=250");
				break;
			}
			case 3:
			{
				System.out.println("3-tier");
				System.out.println("price=550");
				break;
			}
			case 4:
			{
				System.out.println("2-tier");
				System.out.println("price=1150");
				break;
			}
			case 5:
			{
				System.out.println("First class");
				System.out.println("price=2150");
				break;
			}
			default:
				System.out.println("no more seat type");

		}
	}
}
				
			