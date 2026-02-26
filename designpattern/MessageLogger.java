
package designpattern;


public class MessageLogger 
{
    private static MessageLogger instance;

    private MessageLogger() 
    {
        System.out.println("Logger Created");
    }

    public static synchronized MessageLogger getInstance() 
    {
        if (instance == null) {
            instance = new MessageLogger();
        }
        return instance;
    }

    public void logMessage(String msg) 
    {
        System.out.println(Thread.currentThread().getName() + " : " + msg);
    }
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(() -> 
        {
            MessageLogger logger1 = MessageLogger.getInstance();
            logger1.logMessage("Hello from Thread 1");
        });

        Thread t2 = new Thread(() -> {
            MessageLogger logger2 = MessageLogger.getInstance();
            logger2.logMessage("Hello from Thread 2");
        });

        t1.start();
        t2.start();
    }
}
        
    
    

