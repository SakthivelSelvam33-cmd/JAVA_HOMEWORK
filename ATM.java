import java.util.Scanner;
class ATM 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        double balance = 10000.75;   
        float withdraw;
        System.out.print("Enter withdraw amount: ");
        withdraw = sc.nextFloat();       
        int withdrawInt = (int) withdraw;  
        balance = balance - withdrawInt;
        System.out.println("Final Balance: " + balance);
        
    }
}

