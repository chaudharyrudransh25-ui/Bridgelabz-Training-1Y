import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number : ");
		int n = input.nextInt();
		for(int i=2; i<=n; i++){
			if(i%2 != 0 || i == 2){
				System.out.println("prime number : " + i);
				System.out.println(" ");
			}
			else{
				System.out.println("not prime number : " + i);
			}
		}
	}
}





