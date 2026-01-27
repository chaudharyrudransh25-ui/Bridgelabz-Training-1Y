import java.util.Scanner;
class natural2{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			int sum1 = 0;
			int sum2 = n*(n+1)/2;
			
		if(n>0){	
			for(int i =0;i<=n;i++){
				sum1+=i;
			}
		}
		if(sum1 == sum2){
			System.out.print(sum1);
		}
	}
}