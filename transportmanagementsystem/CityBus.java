
package transportmanagementsystem;


public class CityBus extends Transport
{
    

    CityBus(int id, String name, String from, String to, double dist) {
        super(id, name, from, to, dist);
    }
    
    public void calculateFare() {
        fare = distance * 5;
    }

    void displayTicket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
