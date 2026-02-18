
package thread;


public abstract class Payment 
{
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }
    
    
    abstract void paymentprocess();
}
