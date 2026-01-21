import java.util.Scanner;
class pen 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter 1st number : ");
		int total_pens = input.nextInt();
		
		System.out.println("enter 2nd number : ");
		int students = input.nextInt();
		
		int pensPerStudent = total_pens / students;
		int remainingPens = total_pens % students;
		
		System.out.println( + pensPerStudent);
		System.out.println( + remainingPens);
	}
}