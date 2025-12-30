import java.util.Scanner;
class ElectricityBill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your units:");
		short perunit=sc.nextShort();
		double d;
		if(perunit<=100)
		{
			d=perunit*5;
			System.out.println("Total ElectricityBill="+d);
		}
		else if(perunit<=200)
		{
			d=perunit*7;
			System.out.println("Total ElectricityBill="+d);
		}
		else if(perunit>=200)
		{
			d=perunit*10;
			System.out.println("Total ElectricityBillt="+d);
		}
		else 
		{
			System.out.println("Not found units");
		}
	}
}