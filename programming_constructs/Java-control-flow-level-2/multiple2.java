import java.util.Scanner;
class multiple2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int i = 100;
		
		if(n>0 && n<100){
			while(i!=0){
				if(i%n==0){
					System.out.print(i + " ");
				}
				i--;
			}
		}
	}
}