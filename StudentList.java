import java.util.Scanner;
class StudentList
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total no of students");
		int totalstudent=sc.nextInt();
		sc.nextLine();
		String student[]=new String[totalstudent];
		int count=0;
		int choice;
		do
		{
			System.out.println("Enter the choice:");
			System.out.println("1.Add student name");
			System.out.println("2.display the choice");
			System.out.println("3.Exit");
			choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
				
					if(count<totalstudent)
					{
						System.out.println("Enter the student name");
						student[count]=sc.nextLine();
						count++;
						System.out.println("Student list is sucessfully");
						
					}
					else
					{
						System.out.println("student list full");
					}
					break;
				
				case 2:
				
					if(count==0)
					{
						System.out.println("Student data not valid");
					}
					else
					{
							System.out.println("student List");
							for(int i=0;i<count;i++)
							{
								System.out.println((i+1)+" "+student[i]);
							}
					}
					break;
				
				case 3:
				
					System.out.println("Exit the program");
					break;
					
					default:
					
						System.out.println("No more student name");
			}
		}while(choice !=3);
	}
}
					
				
		
									
			
		
		
