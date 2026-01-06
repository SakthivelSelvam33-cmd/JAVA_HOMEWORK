import java.util.Scanner;
class PhoneNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number value");
		int i1=sc.nextInt();
		long l1[]=new long[i1];
		for(int i=0;i<l1.length;i++)
		{
			System.out.println("Enter the number "+i+"index value");
			l1[i]=s.nextLong(); 
		}
		for(int i=0;i<l1.length;i++)
		{
			System.out.println("***** Phone number output*****");
			System.out.println(l1[i]);
		}
	}
}
		