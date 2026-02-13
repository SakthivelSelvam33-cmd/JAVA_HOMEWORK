
package stringconcept;

import java.util.Scanner;


public class StringConcept 
{
    
    

    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the sentence");
        String sentence=sc.nextLine();
        
       
        int charcount=0;
        for(int i=0;i<sentence.length();i++)
        {
            System.out.print(sentence.charAt(i));
            charcount++;
        }
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        
        int vowelCount = 0;
        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowelCount++;
            }
        }
            
            System.out.println("Total characters (without spaces): " + charcount);
        System.out.println("Total words: " + wordCount);
        System.out.println("Total vowels: " + vowelCount);
            
    }
    
}
