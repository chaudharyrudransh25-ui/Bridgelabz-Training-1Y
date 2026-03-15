import java.util.Scanner;
class recursive{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(recursive(n));		
	}
	static int recursive(int n){
		if(n==1){
			return 1;
		}
		return n + recursive(n-1);
	}
}