import java.util.Scanner;

class BankingSystem 
{
     float balance;
     Scanner sc = new Scanner(System.in);
    void inputBalance()
	{
        System.out.print("Enter initial balance: ");
        balance = sc.nextFloat();
    }
     void deposit() 
	 {
        System.out.print("Enter amount to deposit: ");
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Deposit successful!");
        System.out.println("New Balance: " + balance);
    }
     void withdraw() 
	{
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Error: Insufficient balance!");
        }
    }
     void displayBalance() 
	 {
        System.out.println("Current Balance: " + balance);
    }

   
    public static void main(String[] args) 
	{
		BankingSystem bs=new BankingSystem();
		Scanner sc1=new Scanner(System.in);

        int choice;
        bs.inputBalance();   

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    bs.deposit();
                    break;

                case 2:
                    bs.withdraw();
                    break;

                case 3:
                    bs.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the bank system!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);
    }
}
