import java.util.Scanner;
class height
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Height in cm : ");
		int a = input.nextInt();
		
		double b = a/2.54;
		System.out.println("Height in inches : "+b);
		double c = b/12;
		System.out.println("Height in foots : "+c);
	}
}