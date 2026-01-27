import java.util.Scanner;
class abundant
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number: ");
		int num  = input.nextInt();
		int sum = 0;
		int i = 0;
		while(i <= num/2)
		{
			i++;
			if (num%i == 0){
				sum += i;
			}
		}
		System.out.println("sum of factor " + sum);	
		if (sum > num)
		{
			System.out.println("abundant number");
		}
		else
		{
			System.out.println("not abundant number");
		}
		
	}
}