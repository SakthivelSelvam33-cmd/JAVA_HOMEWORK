
package vehiclemanagementsystem;


public class Vehicle 
{
    String brand;
    int year;  

Vehicle(String brand,int year)
{
    this.brand=brand;
    this.year=year;
}
void displayinfo()
{
    System.out.println("CarBrand"+"="+brand);
    System.out.println("Year"+"="+year);
}
}
