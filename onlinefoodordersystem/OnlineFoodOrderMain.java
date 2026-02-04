
package onlinefoodordersystem;

import java.util.Scanner;


public class OnlineFoodOrderMain {

   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        FoodOrder Order=null;
        int choice;
        
        do
        {
            System.out.println("********Menu********");
            System.out.println("1.PlaceOrder");
            System.out.println("2.ViewBill");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter a PlaceOrder");
                    System.out.println("customer Name");
                    sc.nextLine();
                    String CustomerName=sc.nextLine();
                    System.out.println("FoodItem");
                    String FoodItem=sc.nextLine();
                    System.out.println("price");
                    int price=sc.nextInt();
                    Order =new FoodOrder(CustomerName,FoodItem,price);
                    Order.placeorder();
                    break;
                    
                case 2:
                    
                    if (Order !=null ) 
                    {
                        Order.Bill();
                    }   
                    else 
                    {
                        System.out.println("No order placed yet!");
                    }
                   
                    break;
                case 3:
                    System.out.println("Exiting program");
                        break;    
                default:
                {
                    System.out.println("Invalid choice");
                }
            }
        }
        while(choice!=3);
    }
    
}
