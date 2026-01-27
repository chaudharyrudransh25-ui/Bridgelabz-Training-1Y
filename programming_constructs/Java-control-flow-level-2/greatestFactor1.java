 import java.util.Scanner;
class greatestFactor1
{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int greatest_factor = 0;
		int i = n-1;
		
		while(i!=0){
			if(n%i == 0){
				greatest_factor = i;
				break;
			}
			i--;
		}
		System.out.print("greatest factor is : " + greatest_factor);
	}
}