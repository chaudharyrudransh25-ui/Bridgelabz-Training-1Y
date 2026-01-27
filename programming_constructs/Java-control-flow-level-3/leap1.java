import java.util.Scanner;
class leap1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter year");
		int year = input.nextInt();
		
		if(year%100 != 0 || year%400 == 0){
			System.out.println("leap year");
		}
		else{
			System.out.println("not leap year");
		}
	}
}