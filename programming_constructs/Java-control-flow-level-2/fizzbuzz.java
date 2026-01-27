import java.util.Scanner;
class fizzbuzz
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if(n>0){
		for(int i=1;i<=n;i++){
		if(n%3==0 && n%5==0){
					System.out.println("Fizzbuzz");
				}
		else if(n%3==0){
					System.out.println("Fizz");
				}	
		else if(n%5==0){
			        System.out.println("Buzz");
				}
		else{
					System.out.println(i);
				}
			}
		}
	}
}