
package arrayutils;
import java.util.Scanner;
public class BankingSystem 
{
    double initialbalance=0;
    
    public double depositamount(double deposit)
    {
        initialbalance=deposit+initialbalance;
        System.out.println(initialbalance);
        return initialbalance;
    }
    public double withdrawamount(double withdraw)
    {
       
       if(withdraw<=initialbalance) 
       {
           initialbalance=initialbalance-withdraw;
       }
       else
       {
            System.out.println("Insuffficient Balance");
            
       }
      return initialbalance;
    }
    
    public double getcheckBalance()
    {
        return initialbalance;
    }
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      BankingSystem b1=new BankingSystem();
      int choice;
      do
      {
        System.out.println("Enter your choice");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.CheckBalance");
        System.out.println("4.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
       
        switch(choice)
        {
            case 1:
                
                System.out.println("Enter deposit amount");
                double deposit=sc.nextDouble();
                System.out.println("depositamount"+"="+b1.depositamount(deposit));
               
                break;
                
            case 2:
                
                System.out.println("Enter withdraw amount");
                double withdraw=sc.nextDouble();
                System.out.println("withdrawamount"+"="+b1.withdrawamount(withdraw)); 
                
                break;
                
            case 3:
                System.out.println("CheckBalance");
                System.out.println(b1.getcheckBalance());
                break;
                
            case 4:
                System.out.println("Existing Program");
                break;
                
            default:
                System.out.println("Invalid Choice");
                
                
        }
      }while(choice!=4);
      }
}