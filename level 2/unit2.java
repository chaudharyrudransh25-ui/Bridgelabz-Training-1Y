import java.util.Scanner;
class unit2{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		double yards = input.nextDouble();
		double feet = input.nextDouble();
		double inches = input.nextDouble();
		double meters = input.nextDouble();
		System.out.println(YardsToFeet(yards));
		System.out.println(FeetToYards(feet));
		System.out.println(MetersToInches(meters));
		System.out.println(InchesToMeters(inches));
		System.out.print(InchesToCM(inches));
	}
	static double YardsToFeet(double yards){
		return yards*3;
	}
	static double FeetToYards(double feet){
		return feet*0.333333;
	}
	static double MetersToInches(double meters){
		return meters*39.307;
	}
	static double InchesToMeters(double inches){
		return inches*0.0254;
	}
	static double InchesToCM(double inches){
		return inches*2.54;
	}
}