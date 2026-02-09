import java.util.Scanner;
class calculator
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		double a = input.nextDouble();
		
		System.out.print("Enter second number : ");
		double b = input.nextDouble();
		
		System.out.println("Sum : "+(a + b));
		System.out.println("Difference : "+(a - b));
		System.out.println("Multiplication : "+(a * b));
		System.out.println("Division : "+(a/b));
	}
}