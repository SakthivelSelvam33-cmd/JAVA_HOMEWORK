
package shoppingcartapplications;

import java.util.Scanner;


public class ShoppingCartApplicationsMain {

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        
        ShoppingCart s1=new ShoppingCart();
        int choice;
        do
        {
            System.out.println("********MENU********");
            System.out.println("1.Add product");
            System.out.println("2.View Cart");
            System.out.println("3.Exit");
            System.out.println("Enter the choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Add product");
                    System.out.println("Enter the product Id");
                    int productid=sc.nextInt();
                    
                    System.out.println("Enter the product Name");
                    String productname=sc1.nextLine();
                    System.out.println("Enter the product Price");
                    double price=sc.nextDouble();
                    
                    s1.addvalue(productid, productname, price);
                   
                    break;
                    
                case 2:
                    
                    System.out.println("View Cart");
                    s1.display();
                    break;
                    
                case 3:
                    System.out.println("Existing program");
                    break;
                    
                default:
                    System.out.println("Invalid choice, Thank you");
                    
            }
        }while(choice!=3);
        
       
    }
    
}
