import java.util.Scanner;
class Unit{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();
		double miles = input.nextDouble();
		double feet = input.nextDouble();
		double meters = input.nextDouble();
		System.out.println(KmToMiles(km));
		System.out.println(MilesToKm(miles));
		System.out.println(FeetToMeters(feet));
		System.out.println(MetersToFeet(meters));
	}
	static double KmToMiles(double km){
		return km*1.609;
	}
	static double MilesToKm(double miles){
		return miles/1.609;
	}
	static double FeetToMeters(double feet){
		return feet*0.3048;
	}
	static double MetersToFeet(double meters){
		return meters/0.3048;
	}
}