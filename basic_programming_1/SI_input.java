import java.util.Scanner;
class SI_input
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first number :");
		int P = input.nextInt();
		
		System.out.println("enter second number :");
		int R = input.nextInt();
		
		System.out.println("enter third number :");
		int T = input.nextInt();
		
		int SI = P * R * T / 100;
		System.out.println("Simple Interest :" + SI); 
	}
}