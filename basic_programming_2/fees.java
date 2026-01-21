import java.util.Scanner;
class fees
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter fee");
		double a = input.nextDouble();
		
		System.out.println("discount_percentage");
		double b = input.nextDouble();
		
		// discountAmount
		double c = (a * b) / 100;
		double discounted_price = a - c;
		
		System.out.println("discountAmount : " + c);
		System.out.println("discounted price : " + discounted_price);
	
	}
}