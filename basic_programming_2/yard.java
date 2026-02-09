import java.util.Scanner;
class Feet
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Distance in feet : ");
		
		int a = input.nextInt();
		double b = a/3.0;
		double c = b/1760.0;
		
		System.out.println("Distance in yards : "+b);
		System.out.println("Distance in miles : "+c);
	}
	
}