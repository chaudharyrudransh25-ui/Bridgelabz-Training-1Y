import java.util.Scanner;
class simple{
	public static void main(String[] args){
		simple s1 = new simple();
		Scanner input = new Scanner(System.in);
		int principle = input.nextInt();
		double rate = input.nextDouble();
		int time = input.nextInt();
		s1.interest(principle,rate,time);
	}
	void interest(int principle,double rate,int time){
		System.out.println(principle*rate*time/100);
	}
}