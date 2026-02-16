
package bankinterestcalculator;

import java.util.Scanner;


public class BankInterestCalculator 
{
    static String bankname="ABC Bank";
    static double interestrate=7.5;
    static double calculatemethod(double principal,int years)
    {
        double interest;
        interest = (principal * interestrate * years) / 100;
        return interest;
    }

    
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter principal amount");
        double principal=sc.nextDouble();
        System.out.println("Years");
        int years=sc.nextInt();
        double interestamount=calculatemethod(principal,years);
        
        System.out.println("********BANK DETAILS********");
        System.out.println("BankName"+"="+bankname);
        System.out.println("principalamount"+"="+principal);
        System.out.println("InterestRate"+"="+interestamount);
        System.out.println("Years"+"="+years);
        
    }
    
}
