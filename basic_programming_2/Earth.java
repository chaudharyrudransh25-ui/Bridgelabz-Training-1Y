import java.util.Scanner;
class Earth
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st number :");
		int r = input.nextInt();
		
		System.out.println("Enter 2nd number :");
		double miles = input.nextDouble();
		
		// volume in km^3
		double volume_of_earth = (4.0/3) * 3.14 * r * r * r;
		
		// volume in miles^3
		double volume_in_miles = volume_of_earth * miles * miles * miles ;
		
		System.out.println(+ volume_of_earth);
		System.out.println(+ volume_in_miles);
	}
}