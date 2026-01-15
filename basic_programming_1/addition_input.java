import java.util.Scanner;
class addition_input
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  first number");
		int a = input.nextInt();
		System.out.println("Enter Second number");
		int b = input.nextInt();
		
		int sum = a + b;
		System.out.println("Addition of Two Numbers :" + sum);
	}
}