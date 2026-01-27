import java.util.Scanner;
class large
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a = input.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int b = input.nextInt();
		
		System.out.println("Enter 3rd number : ");
		int c = input.nextInt();
		
		
		if(a>=b && a>=c){
			System.out.println("a is largest");
		}
		
		else if(b>=a && b>=c){
			System.out.println("b is largest");
		}
		else if(c>=a && c>=b){
			System.out.println("c is largest");
		}
	}
}