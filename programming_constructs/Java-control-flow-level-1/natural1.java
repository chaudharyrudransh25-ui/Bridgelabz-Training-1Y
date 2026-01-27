import java.util.Scanner;
class natural1{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			
			int sum1 = 0 ;
			int sum2 = n*(n+1)/2;
			int i = 0;
			
		if(n > 0){	
			while(i!=n+1){
				sum1+=i;
				i++;
			}
		}
		if(sum1 == sum2){
			System.out.print(sum1);
		}
	}
}