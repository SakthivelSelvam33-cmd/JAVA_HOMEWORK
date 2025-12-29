import java.util.Scanner;
class Grade
{
	public static void main(String[] args)
	{
		System.out.println("Enter your Grade:");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c)
		{
			case 'A':
			
			System.out.println("Excellent");
			
			break;
			
			case 'B':
			
			System.out.println("very Good");
			
			break;
			
			case 'C':
			
			System.out.println("GOOD");
			
			break;
			
			case 'D':
			
			System.out.println("FAIR");
			
			break;
			
			case 'F':
			
			System.out.println("DULL");
			
			break;
			
			
			
			default:
			
			System.out.println("not a GRADE");
			
		}
	}
}
		