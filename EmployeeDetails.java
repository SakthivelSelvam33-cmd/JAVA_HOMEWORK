import java.util.Scanner;
class EmployeeDetails
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);       
        String[] employees = new String[10];
        int count = 0;
        int choice;
        do {
            
            System.out.println("Employee Management Menu ");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1: 
                    if (count < employees.length) {
                        System.out.print("Enter employee name: ");
                        employees[count] = sc.nextLine();
                        count++;
                        System.out.println("Employee added successfully!");
                    } else {
                        System.out.println("Employee list is full!");
                    }
                    break;

                case 2: 
                    if (count == 0) {
                        System.out.println("No employees to display.");
                    } else {
                        System.out.println("Employee List:");
                        for (int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + employees[i]);
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
