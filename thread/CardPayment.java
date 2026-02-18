
package thread;


public class CardPayment extends Payment implements Runnable 
{

    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    void paymentprocess() 
    {
        System.out.println("CardPayment is"+amount);
    }

    @Override
    public void run() 
    {
        System.out.println("Card payment of "+amount+"completed");
    }
    
    
}
