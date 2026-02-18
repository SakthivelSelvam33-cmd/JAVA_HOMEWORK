
package thread;


public class UPIPayment extends Payment implements Runnable 
{

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void paymentprocess() 
    {
        System.out.println("UPIPayment"+amount);
    }

    @Override
    public void run() 
    {
        System.out.print("UPI payment of "+amount+" completed"); 
    }
    
}
