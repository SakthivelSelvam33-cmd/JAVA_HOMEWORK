import java.util.Scanner;
class AgeCategory
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			
			if(age<13)
			{
				System.out.println("child");
			}
			else if(age>13 && age<19)
			{
				System.out.println("Teenage");
			}
			else if(age>20 && age<59)
			{
				System.out.println("Adult");
			}
			else if(age>60)
			{
				System.out.println("Senior");
			}
			else{
				System.out.println("age not found");
			}
	}
}
			
			