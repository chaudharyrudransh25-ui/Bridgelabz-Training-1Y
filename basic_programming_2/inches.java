import java.util.Scanner;
class inches
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("height(in cm) : ");
		int a = input.nextInt();
		
		double b = a / 2.54;
	    System.out.println("height(in inches) : " + b);
        double c = b / 12;
		System.out.println("height(in foots) : " + c);
	}
}