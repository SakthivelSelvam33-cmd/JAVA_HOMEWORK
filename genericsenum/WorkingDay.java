
package genericsenum;

import java.util.Scanner;

enum WeekDay
{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

}
public class WorkingDay 
{
    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Check if Working Day");
            System.out.println("2. Check if Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter Day: ");
                    String dayInput1 = sc.next().toUpperCase();

                    try 
                    {
                        WeekDay day = WeekDay.valueOf(dayInput1);

                        if (day.ordinal() <= 4) 
                        {
                            System.out.println(day + " is a Working Day");
                        } else {
                            System.out.println(day + " is NOT a Working Day");
                        }

                    } catch (IllegalArgumentException e) 
                    {
                        System.out.println("Invalid Day Entered!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Day: ");
                    String dayInput2 = sc.next().toUpperCase();

                    try {
                        WeekDay day = WeekDay.valueOf(dayInput2);

                        if (day == WeekDay.SATURDAY || day == WeekDay.SUNDAY) {
                            System.out.println(day + " is a Weekend");
                        } else 
                        {
                            System.out.println(day + " is NOT a Weekend");
                        }

                    } catch (IllegalArgumentException e) 
                    {
                        System.out.println("Invalid Day Entered!");
                    }
                    break;

                case 3:
                    System.out.println("All Days of the Week:");
                    for (WeekDay d : WeekDay.values()) 
                    {
                        System.out.println(d);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

    }
}
