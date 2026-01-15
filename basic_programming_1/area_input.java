import java.util.Scanner;
class area_input{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius :");
		int r = input.nextInt();
		
		double area = 3.14 * r * r;
		System.out.println("area of a circle :" + area);
	}
	
}
