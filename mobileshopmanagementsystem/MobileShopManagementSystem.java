
package mobileshopmanagementsystem;

import java.util.Scanner;


public class MobileShopManagementSystem {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        MobileShop shop = new MobileShop();
        int choice;

        do {
            System.out.println(" Mobile Shop Menu");
            System.out.println("1. Add Latest Launch");
            System.out.println("2. Add Regular Stock");
            System.out.println("3. Display Mobiles");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Mobile ID: ");
                    int mobileId = sc.nextInt();
                    sc.nextLine();  

                    System.out.print("Enter Brand Name: ");
                    String mobilebrand = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    shop.inserthead(mobileId, mobilebrand, price);
                    break;

                case 2:
                    System.out.print("Enter Mobile ID: ");
                    int mobileId1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Brand Name: ");
                    String mobilebrand1= sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price1 = sc.nextDouble();

                    shop.inserttail(mobileId1, mobilebrand1, price1);
                    break;

                case 3:
                    shop.display();
                    break;

                case 4:
                    System.out.println("Exiting... Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 4);
        
    }
    
}
