import java.util.Scanner;
class Multiple
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=sc.nextInt();
		double d;
		if(num %3 ==0 )
		{
			d=num%3;
			System.out.println("Divisible by 3");
		}
		else if(num %7 ==0)
		{
			d=num%7;
			System.out.println("Divisible by 7");
		}
		else 
		{
			System.out.println("not divisible ");
		}
	}
}
		