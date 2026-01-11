import java.util.Scanner;

class ArrayReverse
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int choice;
        boolean DisplayEntered = false;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Display Numbers in Reverse Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.println("Enter 10 numbers:");
                    for (int i = 0; i < arr.length; i++) 
					{
                        arr[i] = sc.nextInt();
                    }
                    DisplayEntered = true;
                    break;

                case 2:
                    if (!DisplayEntered) 
					{
                        System.out.println("Please enter numbers first.");
                    } else 
					{
                        System.out.println("Array elements:");
                        for (int i = 0; i < arr.length; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (!DisplayEntered) 
					{
                        System.out.println("Please enter numbers first.");
                    } else 
					{
                        System.out.println("Array in reverse order:");
                        for (int i = arr.length - 1; i >= 0; i--) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
