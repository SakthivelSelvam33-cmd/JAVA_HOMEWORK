
package thread;


public class ThreadMain {

    
    public static void main(String[] args) 
    {
        CardPayment c1=new CardPayment(2000);
        UPIPayment u1=new UPIPayment(30000);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(u1);
        t1.start();
        t2.start();
        
        PermanentEmployee p1=new PermanentEmployee(15000);
        ContractEmployee c2=new ContractEmployee(3000);
        
        Thread t3=new Thread(p1);
        Thread t4=new Thread(c2);
        t3.start();
        t4.start();
        
        
        Printer1 p=new Printer1();
        Thread t5=new Thread(p);
        t5.start();
            
        
    }
    
}
