
package exceptionhandling;

import java.util.Scanner;

class illegalArgumentException extends Exception
{

    public illegalArgumentException(String message) 
    {
        super(message);
    }
    
}
public class StudentMarks 
{
     int marks=-1;
   void addMarks(int m) throws illegalArgumentException
   {
       if(m<0 || m>100)
       {
           throw new illegalArgumentException("less than 0 or greater than 100");
       }
       
           marks=m;
           System.out.println("marks entered successfully");
       
   }
   
   void displayMarks()
   {
       if(marks==-1)
       {
           System.out.println("Below the marks");
       }
       else
       {
           System.out.println("Total marks"+"="+marks);
       }
   }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        StudentMarks s1=new StudentMarks();
        int choice;
        do
        {
            System.out.println("***Student Menu***");
            System.out.println("1.Student Marks");
            System.out.println("2.Display Marks");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Enter your marks");
                    int marks=sc.nextInt();
                    try
                    {
                    s1.addMarks(marks);
                    }
                    catch(illegalArgumentException ie)
                    {
                        System.out.println("Error: " +  ie.getMessage());
                    }
                    break;
                    
                case 2:
                    System.out.println("Display marks");
                    s1.displayMarks();
                    break;
                    
                case 3:
                    System.out.println("Exiting program");
                    break;
                    
                default:
                    System.out.println("Invalid choice !!! Thank you");
            }
        }while(choice!=3);
        
    }
    
}
