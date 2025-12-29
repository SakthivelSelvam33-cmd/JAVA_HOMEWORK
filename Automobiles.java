class Automobiles
{
	public static void main(String[] args)
	{
		int cost=750;
		int percentage=15;
		
		int commission=cost*percentage/100;
		int result=cost-commission;
		
		
		System.out.println("Commission="+commission);
		System.out.println("Result="+result);
	}
}