import java.util.Scanner;
class Handshakes
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Number of students : ");
		
		int a = space.nextInt();
		int b = (a * (a - 1))/2;
		
		System.out.println("Number of handshakes : "+b);
	}
}