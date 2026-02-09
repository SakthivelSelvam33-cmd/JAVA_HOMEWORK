
package gymapplication;

import java.util.Scanner;


public class GymApplicationMain 
{
    

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter Member ID: ");
            int MemberId = sc.nextInt();

            System.out.print("Enter Member Name: ");
            String MemberName = sc.next();

            System.out.print("Enter No of Months: ");
            int Month = sc.nextInt();

            System.out.println("1. Regular Membership");
            System.out.println("2. Personal Training Membership");
            System.out.print("Enter choice: ");
             choice = sc.nextInt();

            int fee = 0;
            String type = "";

            if (choice == 1) {
                RegularTraineer rm = new RegularTraineer(MemberId, MemberName, Month);
                fee = rm.calculatefee(Month);
                type = "Regular";
            } else if (choice == 2) {
                PersonalTraineer pm = new PersonalTraineer(MemberId, MemberName, Month);
                fee = pm.calculatefee(Month);
                type = "Personal Training";
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println("\n----- GYM MEMBERSHIP DETAILS -----");
            System.out.println("Member ID   : " + MemberId);
            System.out.println("Member Name : " + MemberName);
            System.out.println("Months      : " + Month);
            System.out.println("Membership Type : " + type);
            System.out.println("Total Fee       : ₹" + fee);

           
    }while(choice!=2);
}
    
}
       
        
        
        

        
        
    
       

            

        

    
    


   
        
    

