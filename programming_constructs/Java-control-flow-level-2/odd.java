import java.util.Scanner;
class odd
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(n>0){
			for(int i=0;i<=n;i++){
				if(i%2 != 0){
					System.out.println("odd number :" + i);
				}
				else{
					System.out.println("even number :" + i);
				} 
			}
		}
	}
}