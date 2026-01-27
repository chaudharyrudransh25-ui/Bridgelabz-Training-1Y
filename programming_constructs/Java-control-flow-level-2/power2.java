import java.util.Scanner;
class power2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int power = input.nextInt();
		int result = 1;
		int i = 1;
		
		if(n>0 && power>0){
			while(i != power+1){
				result *= n;
				i++;
			}
		}
		System.out.print(result);
	}
}