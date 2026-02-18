
package thread;


public class Printer1  implements Printer,Runnable
{

    

    @Override
    public void printername(String printername) 
    {
        System.out.println("HP printer");
        System.out.println("Canon printer");
    }

    @Override
    public void run() 
    {
        System.out.println("HP printer... Canon printer...");
    }
    
    
    
}
