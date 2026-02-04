
package shapes;

import java.util.Scanner;


public class ShapesMain {

   
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("*******Menu***********");
            System.out.println("1.Enter a Circle");
            System.out.println("2.Enter a square");
            System.out.println("3.Exit");
            System.out.println("Select your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter a circle value");
                    double radius=sc.nextInt();
                    Shape s=new Circle(radius);
                    System.out.println("Circle Radius"+"="+s.calculatearea());
                    break;
                    
                case 2:
                    System.out.println("Enter a Square value");
                    double side=sc.nextInt();
                    Shape s1=new Square(side);
                    System.out.println("Square value"+"="+s1.calculatearea());
                    break;
                    
                case 3:
                    System.out.println("Exiting program");
                    
                default:
                            {
                                System.out.println("Invalid Choice,Thank You"); 
                            }
            }       
                
            
        }while(choice!=3);
        
    }
    
}
