
package designpattern;


public class DesignPattern 
{
     private static DesignPattern instance;

    private DesignPattern() 
    {
        System.out.println("Printer Created");
    }

    public static DesignPattern getInstance() 
    {
        if (instance == null) {
            instance = new DesignPattern();
        }
        return instance;
    }

    public void print() {
        System.out.println("Printing document...");
    }

    public static void main(String[] args) {

        DesignPattern p1 = DesignPattern.getInstance();
        DesignPattern p2 = DesignPattern.getInstance();

        p1.print();
        p2.print();

        System.out.println(p1==p2);
    }
}
    
    

