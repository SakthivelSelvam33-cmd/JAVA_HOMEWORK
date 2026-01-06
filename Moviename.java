import java.util.Scanner;
class Moviename
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie index");
		int a=sc.nextInt();
		String st[]=new String[a];
		
		for(int i=0;i<st.length;i++)
		{
			System.out.println("Enter the value"+i+"movie list");
			st[i]=s.nextLine();
		}
		for(int i=0;i<st.length;i++)
		{
			System.out.println("*****Movie List*****");
			System.out.println(st[i]);
		}
	}
}
	
		