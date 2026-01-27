import java.util.Scanner;
class factorial2
{
	public static void main(String args[])
	{
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			int factorial = 1;
			
		if(n>0){	
			for(int i=1;i<=n;i++){
				factorial *= i;
			}
		}
		System.out.print(factorial);
	}
}