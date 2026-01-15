import java.util.Scanner;
class perimeter_input
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int l = input.nextInt();
		
		System.out.println("Enter second number :");
		int b = input.nextInt();
		
		int perimeter = 2 * (l + b);
		System.out.println("Perimeter of Rectangle :" + perimeter);
		
	}
}