
package genericsenum;

import java.util.Scanner;

enum Signal
{
    RED, YELLOW, GREEN
}
public class GenericsEnum {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            
            System.out.println("--- MENU ---");
            System.out.println("1. Show Signal Meaning");
            System.out.println("2. Check Stop or Go");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    System.out.println("Signal Meanings:");
                    for (Signal signal : Signal.values()) 
                    {
                        switch (signal) 
                        {
                            case RED:
                                System.out.println("RED - Stop");
                                break;
                            case YELLOW:
                                System.out.println("YELLOW - Get Ready");
                                break;
                            case GREEN:
                                System.out.println("GREEN - Go");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter Signal (RED/YELLOW/GREEN): ");
                    String input = sc.next().toUpperCase();

                    try {
                        Signal signal = Signal.valueOf(input);

                        if (signal == Signal.RED) 
                        {
                            System.out.println("Action: STOP");
                        } else if (signal == Signal.GREEN) 
                        {
                            System.out.println("Action: GO");
                        } else 
                        {
                            System.out.println("Action: WAIT AND GET READY");
                        }

                    } catch (IllegalArgumentException e) 
                    {
                        System.out.println("Invalid Signal Entered!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);
    }
}





    

