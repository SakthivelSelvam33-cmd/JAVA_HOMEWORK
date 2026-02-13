
package stringconcept;

import java.util.Scanner;


public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("Enter the sentence");
       String sentence=sc.nextLine();
        boolean palindrome=true;
        int start=0;
        int end=sentence.length()-1;
        
        while(start<end)
        {
            if(sentence.charAt(start)!=sentence.charAt(end))
            {
                palindrome=false;
                break;
            }
            start++;
            end--;
            
        }
        if(palindrome)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        
        
        
        
    }
    
}
