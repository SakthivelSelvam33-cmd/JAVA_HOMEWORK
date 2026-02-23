
package studentmanagementsystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class StudentManagementSystemMain 
{
    static Scanner sc=new Scanner(System.in);
    static Scanner sc1=new Scanner(System.in);
    static HashSet<Integer> h1=new HashSet<>();
    static HashMap<Integer,String> h2=new HashMap<>();
    public static void main(String[] args) 
    {
        int choice;
        do
        {
            System.out.println("MENU");
            System.out.println("1.Add student");
            System.out.println("2.Remove student");
            System.out.println("3.Search Student");
            System.out.println("4.Display all student");
            System.out.println("5.Display all student count");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Add Student");
                    System.out.println("Student id");
                    int id=sc.nextInt();
                    System.out.println("Student name");
                    String name=sc1.nextLine();
                    h1.add(id);
                    h2.put(id, name);
                    System.out.println("Student added successfully");
                    break;
                    
                case 2:
                    System.out.println("Remove student ids");
                    int ids=sc.nextInt();
                    
                    if(h1.contains(ids))
                    {
                       h1.remove(ids);
                       h2.remove(ids);
                        System.out.println("Student remove successfully");
                    }
                    else
                    {
                        System.out.println("Student id not found");
                    }
                    break;
                    
                case 3:
                    System.out.println("Search Student");
                    int id1=sc.nextInt();
                    if(h2.containsKey(id1))
                    {
                        System.out.println("StudentName:"+h2.get(id1));
                    }
                    else
                    {
                        System.out.println("Search data not found");
                    }
                    break;
                    
                case 4:
                    System.out.println("Display all student");
                    System.out.println("\nStudent Details:");
                    for (Integer id2 : h1) 
                    {
                    System.out.println("ID: " + id2 + " | Name: " + h2.get(id2));
                    }
                    break;
                    
                case 5:
                    System.out.println("Display student count");
                     System.out.println("Total Students: " + h1.size());
                    break;
                    
                case 6:
                    System.out.println("Existing program");
                    break;
                    
                default:
                    System.out.println("Invalid choice!!! Thank you");
                    
                    
       }
            
        }while(choice!=6);
    }
    
}
