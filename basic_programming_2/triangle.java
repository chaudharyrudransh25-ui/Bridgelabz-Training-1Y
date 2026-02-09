import java.util.Scanner;
class triangle
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Base in cm : ");
		int a = input.nextInt();
		
		System.out.print("Height in cm : ");
		int b = input.nextInt();
		double c = 1/2.0 * a * b;
		
		System.out.println("Area in sq cm : " +c);
		System.out.println("Area in sq inches : " +(c * 1/2.54 * 1/2.54));
	}