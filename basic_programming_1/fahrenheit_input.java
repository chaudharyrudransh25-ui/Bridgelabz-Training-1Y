import java.util.Scanner;
class fahrenheit_input
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number :");
		int celcius = input.nextInt();
		
		double fahrenheit = (celcius * 9/5) + 32;
		System.out.println("Fahrenheit :" + fahrenheit);
	}
}