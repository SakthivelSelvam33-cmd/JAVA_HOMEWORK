
package employeemanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Employees
{
     int employeeId;
     String name;
     String department;

   public Employees(int employeeId, String name, String department) 
   {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department; 
   }
    public void display()
    {
        System.out.println("DISPLAY");
        System.out.println("EmployeeId"+"="+employeeId);
        System.out.println("Name"+"="+name);
        System.out.println("Department"+"="+department);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Employees e1;
        ArrayList<Employees> a1=new ArrayList<Employees>();
        int choice;
        do
        {
            System.out.println("MENU");
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Search");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Add Employee data");
                    System.out.println("EmployeeId");
                    int employeeId=sc.nextInt();
                    System.out.println("Name");
                    String name=sc1.nextLine();
                    System.out.println("Department");
                    String department=sc1.nextLine();
                     e1=new Employees(employeeId, name, department);
                    a1.add(e1);
                    break;
                    
                case 2:
                    System.out.println("Display employee data");
                    if(a1.isEmpty())
                    {
                        System.out.println("No employee data");
                    }
                    else
                    {
                        for(Employees e2:a1)
                        {
                            e2.display();
                        }
                        
                    }
                    break;
                    
                case 3:
                    System.out.println("Search Id");
                    int searchId=sc.nextInt();
                    for(Employees e2:a1)
                    {
                        if(e2.employeeId==searchId)
                        {
                            e2.display();
                        }
                        else
                        {
                            System.out.println("Not found");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Existing program");
                    break;
                    
                    default:
                        System.out.println("Invalid choice");

            }
        }while(choice!=4);  
    }
    
}
