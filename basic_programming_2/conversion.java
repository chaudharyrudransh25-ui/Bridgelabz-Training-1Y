import java.util.Scanner;
class conversion
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number :");
		double km = input.nextDouble();
		
		double miles = km * 1.6;
		System.out.println("miles is :" + miles);
	}
}