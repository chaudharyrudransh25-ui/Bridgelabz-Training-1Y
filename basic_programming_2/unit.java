import java.util.Scanner;
class unit
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unit price : ");
		int a = input.nextInt();
		
		System.out.print("Quantity : ");
		int b = input.nextInt();
		System.out.println("Total amount : " +(a * b));
		
		
	}
}