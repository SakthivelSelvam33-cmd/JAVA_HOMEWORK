import java.util.Scanner;
class EMICalculator 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        
        long principal;       
        float annualRate;     
        int years;            

        
        System.out.print("Enter Principal Amount: ");
        principal = sc.nextLong();

        System.out.print("Enter Annual Interest Rate (%): ");
        annualRate = sc.nextFloat();

        System.out.print("Enter Time (years): ");
        years = sc.nextInt();
      
        float monthlyRate = annualRate / (12 * 100);   
        int months = years * 12;      
		float p = (float) principal;

        double emiCorrect = (p * monthlyRate * Math.pow(1 + monthlyRate, months))/ (Math.pow(1 + monthlyRate, months) - 1);
        
        float wrongRate = (int) annualRate / (12 * 100);

        double emiWrong = (p * wrongRate * Math.pow(1 + wrongRate, months))/ (Math.pow(1 + wrongRate, months) - 1);
        System.out.println("\nCorrect EMI (Proper Casting): " + emiCorrect);
        System.out.println("Wrong EMI (Incorrect Casting): " + emiWrong);

        
    }
}
