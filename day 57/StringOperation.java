
package arrayutils;

import java.util.Scanner;


public class StringOperation 
{
    public int Length(String str)
    {
        return str.length();
    }
    public String toUpperCase(String str)
    {
        return str.toUpperCase();
    }
    public String toLowerCase(String str)
    {
        return str.toLowerCase();
    }
    public String reverseString(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
           rev=rev+str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        StringOperation s1=new StringOperation();
        System.out.println("Enter the string value");
        String str=sc.nextLine();
        int choice;
        do
        {
            System.out.println("Enter your choice");
            System.out.println("1.Length");
            System.out.println("2.toUpperCase");
            System.out.println("3.toLowerCase");
            System.out.println("4.ReverseString");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("Length");
                    System.out.println("String Length"+"="+s1.Length(str));
                    break;
                    
                case 2:
                    System.out.println("toUpperCase");
                    System.out.println("UpperCase"+"="+s1.toUpperCase(str));
                    break;
                    
                case 3:
                    System.out.println("toLowerCase");
                    System.out.println("LowerCase"+"="+s1.toLowerCase(str));
                    break;
                    
                case 4:
                    System.out.println("Reverse String");
                    System.out.println("Reverse String"+"="+s1.reverseString(str));
                    break;
                    
                case 5:
                    System.out.println("Existing proram");
                    break;
                    
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=5);
    }
    
}
