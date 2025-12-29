import java.util.Scanner;
class Shape
{
	public static void main(String[] args)
	{
		System.out.println("Enter your shape");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:
			{
				
				System.out.println("circle");
				break;
			}
			case 2:
			{
				System.out.println("Square");
				
				break;
			}
			case 3:
			{
				System.out.println("Triangle");
			
				break;
			}
			case 4:
			{
				System.out.println("Rectangle");
				
				break;
				
			
			}		default:
				System.out.println("no more shape");

		}
	}
}
				
			