import java.util.Scanner;
class fizzbuzz2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i=0;
		if(n>0){
		while(i!=n){
		if(n%3==0 && n%5==0){
					System.out.println("fizzbuzz");
				}
		else if(n%3==0){
					System.out.println("fizz");
				}	
		else if(n%5==0){
			        System.out.println("buzz");
				}
		else{
					System.out.println(i);
				}
				i++;
			}
		}
	}
}