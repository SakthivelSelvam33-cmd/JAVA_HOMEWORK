
package array;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        Random r=new Random();
        do
        {
        System.out.println("***MENU***");
        System.out.println("1.Rock");
        System.out.println("2.Paper");
        System.out.println("3.Scissors");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        int Player=sc.nextInt(3)+1;
        switch(choice)
        {
            case 1:
                System.out.println("Rock");
                if(choice==Player)
                {
                    System.out.println("Match draw");
                }
                else if(Player==2)
                {
                    System.out.println("Paper beats Rock");
                }
                else
                {
                    System.out.println("Rock beats scissors");
                }
                break;
                
            case 2:
                System.out.println("Paper");
                if(choice==Player)
                {
                    System.out.println("Match draw");
                }
                else if(Player==3)
                {
                    System.out.println("Rock beats Paper");
                }
                else
                {
                    System.out.println("Paper beats scissors");
                }
                break;
            case 3:
                System.out.println("Scissor");
                if(choice==Player)
                {
                    System.out.println("Match draw");
                }
                else if(Player==3)
                {
                    System.out.println("Rock beats scissors");
                }
                else
                {
                    System.out.println("Scissor beats paper");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
        }while(choice!=3);
        
    }
    
}
