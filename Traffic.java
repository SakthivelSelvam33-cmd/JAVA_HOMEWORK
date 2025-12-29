import java.util.Scanner;
class Traffic
{
	public static void main(String[] args)
	{
		System.out.println("Enter your colour:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
			case "Red":
			
			System.out.println("stop");
			
			break;
			
			case "Yellow":
			
			System.out.println("start");
			
			break;
			
			case "Green":
			
			System.out.println("go");
			
			break;
			
			default:
			
			System.out.println("not a colour");
		}
	}
}
			