import java.util.Scanner;
class athlete{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		athlete a1 = new athlete();
		int distance = input.nextInt();
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		System.out.print("rounds: " + a1.rounds(side1,side2,side3,distance));
	}
	int rounds(int side1,int side2,int side3,int distance){
		return (side1+side2+side3)/distance;
	}
}