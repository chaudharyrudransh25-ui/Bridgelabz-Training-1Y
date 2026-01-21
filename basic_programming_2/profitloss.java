import java.util.Scanner;
class profitloss
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("cost_price :");
        double a = input.nextDouble();

		System.out.println("selling_price :");
		double b = input.nextDouble();
		
		double profit = b - a;
		System.out.println("profit :" + profit); 
		
		// profit percentage
	    double c  = (profit/a) * 100;
		System.out.println("profit percentage :" + c);
	}
}