import java.util.Scanner;
class volume_input
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number :");
		int r = input.nextInt();
		
		System.out.println("Enter second number :");
		int h = input.nextInt();
		
		double volume = 3.14 * r * r * h;
		System.out.println("Volume of Cylinder :" + volume);
		
	}
}