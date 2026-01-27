import java.util.Scanner;
class factors1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.print("factors of n : ");
		int i=1;
		
		while(i != n+1){
			if(n%i == 0){
				System.out.print(i + " ");
			}
			i++;
		}
	}
}