import java.util.Scanner;
class LibraryMain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Library[] l1=new Library[n];
		int count=0;
		int choice;
		do
		{
			System.out.println("******MENU*******");
			System.out.println("1.Add a new Book");
			System.out.println("2.Display all books");
			System.out.println("3.Borrow a book");
			System.out.println("4.Return a book");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					if(count>=l1.length)
					{
						System.out.println("Book is full");
						break;
					}
					System.out.println("Enter book id"+"  ");
					int bookId=sc.nextInt();
					sc.nextLine();
					
					System.out.print("Enter bookTitle"+"  ");
					String title=sc.nextLine();
					
					System.out.print("Enter bookAuthor"+"  ");
					String author=sc.nextLine();		
					
					l1[count] =new Library(bookId,title,author);
					count++;
					System.out.println("Book added successfully");
					break;
			
				case 2:
					System.out.println("Display all books");
					if(count==0)
					{
						System.out.println("No books available");
					}
					else
					{
					for(int i=0;i<count;i++)
					{
						l1[i].display();
					}
					}
					break;
					
					case 3:
						System.out.println("Enter a borrow book id");
						int borrowid=sc.nextInt();
						boolean foundborrow=false;
						
						for(int i=0;i<count;i++)
						{
							if(l1[i].bookId==borrowid)
							{
								l1[i].borrowbook();
								foundborrow=true;
								break;
								
							}
						}
						if(!foundborrow)
							System.out.println("Book is not found");
						break;
						case 4:
							System.out.println("Enter a return bookId");
							int returnid=sc.nextInt();
							boolean foundreturn=false;
							for(int i=0;i<count;i++)
							{
								if(l1[i].bookId==returnid)
								{
									l1[i].returnbook();
									foundreturn=true;
									break;
								}
							}
							if(!foundreturn)
								System.out.println("Return book is not found");
							break;
			}	
		}while(choice!=5);
		
	}
}