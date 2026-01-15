import java.util.Scanner;
class km_to_miles_input
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number :");
		int km = input.nextInt();
		
		double miles = km * 0.621371;
		System.out.println("miles :" + miles);
		
		
	}
}