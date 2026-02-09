import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter 1st number : ");
		double a = input.nextDouble();
		
		System.out.print("enter 2nd number : ");
		double b = input.nextDouble();
		
		System.out.println("Addition : " +(a + b));
		System.out.println("Difference : " +(a - b));
		System.out.println("Multiplication : " +(a * b));
		System.out.println("Division : " +(a/b));
	}
}