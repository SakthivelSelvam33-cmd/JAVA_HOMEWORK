import java.util.Scanner;

class LibraryManagementSystem 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] bookId = new int[10];
        String[] bookName = new String[10];
        int count = 0;
        int choice;

        do 
		{
            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. Add Books");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    if (count >= 10) 
					{
                        System.out.println("Library is full!");
                    } else {
                        System.out.print("Enter Book ID: ");
                        bookId[count] = sc.nextInt();
                        sc.nextLine(); // clear buffer

                        System.out.print("Enter Book Name: ");
                        bookName[count] = sc.nextLine();

                        count++;
                        System.out.println("Book added successfully!");
                    }
                    break;

                case 2:
                    if (count == 0) 
					{
                        System.out.println("No books available.");
                    } 
					else 
					{
                        System.out.println("\nBook ID\tBook Name");
                        for (int i = 0; i < count; i++) {
                            System.out.println(bookId[i] + "\t" + bookName[i]);
                        }
                    }
                    break;

                case 3:
                    if (count == 0) 
					{
                        System.out.println("No books to search.");
                    } else 
					{
                        System.out.print("Enter Book ID to search: ");
                        int searchId = sc.nextInt();
                        boolean found = false;

                        for (int i = 0; i < count; i++) 
						{
                            if (bookId[i] == searchId) 
							{
                                System.out.println("Book Found: " + bookName[i]);
                                found = true;
                                break;
                            }
                        }

                        if (!found) 
						{
                            System.out.println("Book ID not found.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Library System...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        
    }
}
