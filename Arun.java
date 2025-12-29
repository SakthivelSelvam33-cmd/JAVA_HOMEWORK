class Arun
{
	public static void main(String[] args)
	{
		int deposit=50000;
		int percentage=6;
		int year=5;
		int Interest=deposit*percentage*year/100;
		int totalInterest=deposit+Interest;
		System.out.println("Total balance="+totalInterest);
	}
}
