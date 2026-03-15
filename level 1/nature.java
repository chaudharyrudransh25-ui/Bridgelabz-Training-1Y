import java.util.Scanner;
class nature{
	public static void main(String[] args){
		nature n1 = new nature();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print("number: " + n1.nature(n));
	}
	int nature(int n){
		if(n<0){
			return -1;
		}
		else if(n==0){
			return 0;
		}
			return 1;
	}
}