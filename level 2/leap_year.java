import java.util.Scanner;
class leap_year{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.print(leap(year));
	}
	static boolean leap(int year){
		if(((year%4==0)&&(year%100!=0))||year%400==0){
			return true;
		}
		return false;
	}
}