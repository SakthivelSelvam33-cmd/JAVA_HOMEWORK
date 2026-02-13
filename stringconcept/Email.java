
package stringconcept;

import java.util.Scanner;


public class Email 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the sentence");
        String email=sc.nextLine();
        
        boolean hasAt=email.contains("@");
        boolean hasdot=email.contains(".");
        
        int indexAt=email.indexOf("@");
        int indexdot=email.indexOf(".");
        
        if(hasAt&&hasdot&&indexAt<indexdot)
        {
            System.out.println("valid email");
        }
        else
        {
            System.out.println("invalid");
        }
        
        
        
    }
    
}
