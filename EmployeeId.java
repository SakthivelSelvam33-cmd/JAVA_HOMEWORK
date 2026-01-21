import java.util.Scanner;
class EmployeeId
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int employeeid=sc.nextInt();
		int arr[]=new int[employeeid];
		int newarr[]=new int[arr.length-1];
		int choice;
		int index=0;
		do
		{
			System.out.println("Enter the Employee choice:");
			System.out.println("1.Add employee ID");
			System.out.println("2.Remove employee ID");
			System.out.println("3.Display employeeID");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Add employee Id");
			for(int i=0;i<arr.length;i++)
			{
				
				if(index<arr.length)
				{
					System.out.println("Enter the employee "+(index));
					arr[i]=sc.nextInt();
					index++;
				}
				else
				{
					System.out.println("no more employee id");
				}
				
				
			}
			break;
		case 2:
			System.out.println("Remove employee Id");
			int indexvalue=2;
			
			
			for(int i=0;i<indexvalue;i++)
			{
				newarr[i]=arr[i];
			}
			
			for(int i=indexvalue;i<newarr.length;i++)
			{
				newarr[i-1]=arr[i];
			}
			for(int i=0;i<newarr.length;i++)
			{
			System.out.println(newarr[i]);
			}
				break;
		
				
			case 3:
			System.out.println("Display the employee id");
			for(int i=0;i<newarr.length;i++)
			{
				System.out.println(newarr[i]);
				
			}break;
			case 4:
				System.out.println("Exiting program");
		}
		}while(choice!=4);
	}
}

	