import java.util.Scanner;
class digit
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("enter number: ");
		num = input.nextInt();
		int count = 0;
		int temp = num;
		
		while (temp != 0)
		{
			count++;
			temp = temp/10;
		}
		System.out.println("the number of digit is: "+count);
	}
}