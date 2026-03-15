import java.util.Scanner;
class sum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(sum(n));
	}
	static int sum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		return sum;
	}
}