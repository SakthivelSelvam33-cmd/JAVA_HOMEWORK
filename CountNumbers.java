import java.util.Scanner;

class CountNumbers
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int choice;
        boolean isEntered = false;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Count Positive Numbers");
            System.out.println("4. Count Negative Numbers");
            System.out.println("5. Count Zeros");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.println("Enter 10 integers:");
                    for (int i = 0; i < arr.length; i++) 
					{
                        arr[i] = sc.nextInt();
                    }
                    isEntered = true;
                    break;

                case 2:
                    if (!isEntered) 
					{
                        System.out.println("Please enter numbers first.");
                    } else 
					{
                        System.out.print("Array elements: ");
                        for (int i = 0; i < arr.length; i++) 
						{
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    if (!isEntered) 
					{
                        System.out.println("Please enter numbers first.");
                    } 
					else 
					{
                        int positive = 0;
                        for (int i = 0; i < arr.length; i++) 
						{
                            if (arr[i] > 0) {
                                positive++;
                            }
                        }
                        System.out.println("Positive numbers count: " + positive);
                    }
                    break;

                case 4:
                    if (!isEntered) 
					{
                        System.out.println("Please enter numbers first.");
                    } 
					else 
					{
                        int negative = 0;
                        for (int i = 0; i < arr.length; i++) 
						{
                            if (arr[i] < 0) {
                                negative++;
                            }
                        }
                        System.out.println("Negative numbers count: " + negative);
                    }
                    break;

                case 5:
                    if (!isEntered) 
					{
                        System.out.println("Please enter numbers first.");
                    } 
					else 
					{
                        int zero = 0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == 0) {
                                zero++;
                            }
                        }
                        System.out.println("Zero count: " + zero);
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        
    }
}
