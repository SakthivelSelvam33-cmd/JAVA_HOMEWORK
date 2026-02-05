
package transportmanagementsystem;


public class LuxuryBus extends CityBus
{
    LuxuryBus(int id, String name, String from, String to, double dist) {
        super(id, name, from, to, dist);
    }

    public void calculateFare() {
        fare = (distance * 10) + 200;
    }
    
}
