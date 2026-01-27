import java.util.Scanner;
class greatestFactor
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int greatest_factor = 0;
		
		for(int i=n-1; i>=1; i--){
			if(n%i == 0){
				greatest_factor = i;
				break;
			}
		}
		System.out.print("Greatest Factor is : " + greatest_factor);
	}
}