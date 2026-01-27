import java.util.Scanner;
class naturalNumber
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number");
		int n = input.nextInt();
		
		if(n > 0)
		{
			int sum = n*(n+1)/2;
			System.out.println("sum of natural number is :" + sum);
		}
		else{
			System.out.println("not natural number");
		}
	
	}
}