
package exceptionhandling;
import java.util.Scanner;
public class ATMSystem 
{
    double initialbalance=1000;
    Scanner sc=new Scanner(System.in);

    void deposit()
    {
        System.out.println("deposit amount");
        double depositamount=sc.nextDouble();
        initialbalance=initialbalance+depositamount;
        System.out.println(initialbalance);
    }
    void withdraw()throws ArithmeticException 
    {
        System.out.println("withdraw amount");
         double withdrawamount=sc.nextDouble();
        if(withdrawamount>initialbalance) 
        {
             throw new ArithmeticException("Insufficient balance!!!"); 
        }
        else
        {
            initialbalance=withdrawamount-initialbalance;
            System.out.println(initialbalance);           
        }
        
    }
    void checkbalance()
    {
        System.out.println("Account balance"+initialbalance);
    }
    public static void main(String[] args) 
    {
            Scanner sc1=new Scanner(System.in);

        ATMSystem a1=new ATMSystem();
        int choice;
        do
        {
            System.out.println("*******MENU**********");
            System.out.println("1.Withdraw Money");
            System.out.println("2.deposit Money");
            System.out.println("3.Check account balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice=sc1.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("-----Deposit Amount------");
                    
                    a1.deposit();
                    break;
                    
                case 2:
                    System.out.println("Withdraw amount");
                   try
                   {
                    a1.withdraw();
                   }
                   catch(ArithmeticException e)
                   {
                       System.out.println("handle the situation where the withdrawal amount is greater than the available balance");
                   }
                    break;
                    
                case 3:
                    System.out.println("Check Balance");
                    a1.checkbalance();
                    break;
                    
                default:
                    System.out.println("Invalid choice!!! Thank you");      
            }
        }while(choice!=4);    
    }
}

