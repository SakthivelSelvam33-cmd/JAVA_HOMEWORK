
package transportmanagementsystem;

import java.util.Scanner;


public class TransportManagementSystem 
{
    static Scanner sc = new Scanner(System.in);
     static CityBus cityBus;
     static LuxuryBus luxuryBus;
     static int busType = 0; 
     static double selectRoute(String[] route) {
        System.out.println("Select Route:");
        System.out.println("1. Chennai -> Bangalore");
        System.out.println("2. Chennai -> Coimbatore");
        System.out.println("3. Chennai -> Madurai");
        System.out.println("4. Chennai -> Trichy");
        System.out.println("5. Chennai -> Salem");
        System.out.print("Enter route choice: ");

        int r = sc.nextInt();
        route[0] = "Chennai";

        switch (r) {
            case 1: route[1] = "Bangalore"; return 350;
            case 2: route[1] = "Coimbatore"; return 500;
            case 3: route[1] = "Madurai"; return 460;
            case 4: route[1] = "Trichy"; return 330;
            case 5: route[1] = "Salem"; return 340;
            default: return 0;
        }
     }

    
    public static void main(String[] args) 
    {
        int choice;

        do {
            System.out.println("\n---- TRANSPORT MANAGEMENT SYSTEM ----");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: {
                    System.out.print("Enter Passenger ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    String[] route = new String[2];
                    double dist = selectRoute(route);

                    cityBus = new CityBus(id, name, route[0], route[1], dist);
                    busType = 1;

                    System.out.println("Ticket Booked Successfully");
                    break;
                }

                case 2: {
                    System.out.print("Enter Passenger ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    String[] route = new String[2];
                    double dist = selectRoute(route);

                    luxuryBus = new LuxuryBus(id, name, route[0], route[1], dist);
                    busType = 2;

                    System.out.println("Ticket Booked Successfully");
                    break;
                }

                case 3:
                    if (busType == 1 && cityBus != null) {
                        cityBus.calculateFare();
                        System.out.println("Fare Calculated Successfully");
                    } else if (busType == 2 && luxuryBus != null) {
                        luxuryBus.calculateFare();
                        System.out.println("Fare Calculated Successfully");
                    } else {
                        System.out.println("Please book a ticket first");
                    }
                    break;

                case 4:
                    if (busType == 1 && cityBus != null) {
                        cityBus.displayTicket();
                    } else if (busType == 2 && luxuryBus != null) {
                        luxuryBus.displayTicket();
                    } else {
                        System.out.println("No ticket to display");
                    }
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}
    
    

