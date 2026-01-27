import java.util.*;
class calculator
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int a = input.nextInt();
		System.out.print("enter  second number: ");
		int b = input.nextInt();
		
		System.out.println("Choose operation:");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");
		
		int value = input.nextInt();
		
		switch (value) 
		{
			case 1 :
			System.out.println("sum is : "+(a+b));
			break;
			case 2 :
			System.out.println("diff is : "+(a-b));
			break;
			case 3 :
			System.out.println("multiplication is : "+(a*b));
			break;
			case 4:
			System.out.println("division is : "+(a/b));
			break;
	
			default :
			System.out.println("invalid operator");
		}	
		
	}
}