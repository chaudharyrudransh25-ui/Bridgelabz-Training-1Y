import java.util.Scanner;
class factorial
{
	public static void main(String[] args)
	{
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			int factorial = 1;
			int i = 1;
			
		if(n > 0){	
			while(i!=n+1){
				factorial *= i;
				i++;
			}
		}
		System.out.print(factorial);
	}
}