
package bankinterestcalculator;

import java.util.Scanner;


public class College 
{
    static final String collegeName = "XYZ Engineering College";

    final double registrationFee;

    static int totalStudents = 0;

    public College(double registrationFee) 
    {
        this.registrationFee = registrationFee;
        totalStudents++;
    }
    
    static void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
    }
    void displayStudentFee() {
        System.out.println("Student Registration Fee: " + registrationFee);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Fee for Student : ");
        double fee1 = sc.nextDouble();
        College student1 = new College(fee1);

        

        // Display details
        College.displayCollegeDetails();

        student1.displayStudentFee();
        
        
    }

    
}
