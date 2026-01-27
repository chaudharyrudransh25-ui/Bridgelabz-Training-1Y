import java.util.Scanner;
class factors
{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.print("factors of n : ");
		for(int i=1;i<=n;i++){
			if(n%i == 0){
				System.out.print(i + " ");
			}
		}
	}
}