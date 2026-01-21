import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter maths marks :");
		int maths = input.nextInt();
		
		System.out.println("enter physics marks :");
		int physics = input.nextInt();
		
		System.out.println("enter chemistry marks :");
		int chemistry = input.nextInt();
		
		double average = (maths + physics + chemistry) / 3;
		System.out.println("Average is :" + average);
	}
}