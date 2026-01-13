import java.util.Scanner;

class GameRanking 
{
    public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
        long score;
        double time;

        System.out.print("Enter player score: ");
        score = sc.nextLong();

        System.out.print("Enter time taken: ");
        time = sc.nextDouble();       
        long rankScore = score / (long) time;
        System.out.println("Rank Score (Wrong Casting): " + rankScore);
        
    }
}
