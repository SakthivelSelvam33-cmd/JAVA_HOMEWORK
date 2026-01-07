import java.util.Scanner;
class Marks
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row array:");
		byte row=sc.nextByte();
		System.out.println("Enter the column array:");
		byte column=sc.nextByte();
		
		byte ar[][]=new byte [row][column];
		System.out.println("Enter the user-defined value:");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				System.out.println("Enter the array"+i+" "+j+" "+"index value");
				ar[i][j]=sc.nextByte();
			}
		}
		System.out.println("Enter the output value:");
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
			System.out.print(ar[i][j]+" ");
			}
		
		System.out.println(" ");
		}
	}
}

		