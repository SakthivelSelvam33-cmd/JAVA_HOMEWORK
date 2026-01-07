import java.util.Scanner;
class WithScanner
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the row value:");
		byte row=sc.nextByte();
		System.out.println("Enter the column value:");
		byte column=sc.nextByte();
		
		
		String s[][]=new String[row][column];
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				System.out.println("Enter the array"+i+" "+j+" "+"index value");
				s[i][j]=sc1.nextLine();
			}
		}
		System.out.println("Enter the output value:");
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
			System.out.print(s[i][j]+" ");
			}
		
		System.out.println(" ");
		}
	}
}
		
		
		