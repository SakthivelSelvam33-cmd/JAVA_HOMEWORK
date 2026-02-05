
package transportmanagementsystem;


public abstract class Transport implements Transports
{
    
    int passengerId;
    String passengerName;
    String fromCity;
    String toCity;
    double distance;
    double fare;

    
    Transport(int id, String name, String from, String to, double dist) {
        passengerId = id;
        passengerName = name;
        fromCity = from;
        toCity = to;
        distance = dist;
    }
    
     void displayTicket() {
        System.out.println("\n----- TICKET DETAILS -----");
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Route : " + fromCity + " -> " + toCity);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + fare);
    }
}
    

