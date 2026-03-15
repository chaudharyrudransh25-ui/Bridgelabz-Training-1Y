import java.util.Scanner;
class handshake{
	public static void main(String[] args){
		handshake h1 = new handshake();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print("maximum handshakes: " + h1.handshake(n));
	}
	int handshake(int n){
		return n*(n-1)/2;
	}
}