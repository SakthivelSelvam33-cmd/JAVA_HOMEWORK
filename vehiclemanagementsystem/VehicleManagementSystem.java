
package vehiclemanagementsystem;


public class VehicleManagementSystem  {

   
    public static void main(String[] args) 
    {
        Car c=new Car("Car", 2001, 4);
        c.displayinfo();
        MotorCycle m=new MotorCycle("Pulsar", 2023, "sport");
        m.displayinfo();
        
    }
    
}
