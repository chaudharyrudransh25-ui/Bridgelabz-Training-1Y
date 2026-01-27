import java.util.Scanner;
class power1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int power = input.nextInt();
		int result = 1;
		
		if(n>0 && power>0){
			for(int i=1; i<=power; i++){
				result *= n;
			}
		}
		System.out.print(result);
	}
}