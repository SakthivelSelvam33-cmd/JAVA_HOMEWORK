
package vehiclemanagementsystem;


public class MotorCycle extends Vehicle
{
    String type;

    public MotorCycle(String brand,int year,String type) 
    {
        super(brand, year);
        this.type=type;
    }
    public void displayinfo()
    {
        System.out.println("Type"+"="+type);
    }
    
    
}
