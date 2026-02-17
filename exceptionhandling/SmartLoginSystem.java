
package exceptionhandling;

import java.util.Scanner;



public class SmartLoginSystem 
{
    class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}
    static final String USERNAME = "admin";
    static final String PASSWORD = "1234";
    static int attempts = 0;
    static final int MAX_ATTEMPTS = 3;

    public static void login(String user, String pass) throws AccountLockedException {

        if (attempts >= MAX_ATTEMPTS) {
            throw new AccountLockedException("Account Locked! Too many failed attempts.");
        }

        if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
            System.out.println("Login Successful! Welcome " + user);
            attempts = 0; // reset attempts after successful login
        } else {
            attempts++;
            int remaining = MAX_ATTEMPTS - attempts;
            System.out.println("Invalid Credentials!");

            if (remaining > 0) {
                System.out.println("Remaining Attempts: " + remaining);
            } else {
                throw new AccountLockedException("Account Locked! No attempts left.");
            }
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" SMART LOGIN SYSTEM");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter Username: ");
                        String user = sc.nextLine();

                        System.out.print("Enter Password: ");
                        String pass = sc.nextLine();

                        login(user, pass);

                    } catch (AccountLockedException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("System Exiting...");
                        return; 
                    }
                    break;

                case 2:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 2);
    }

    
}
