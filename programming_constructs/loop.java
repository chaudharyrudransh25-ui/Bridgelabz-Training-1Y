import java.util.Scanner;
class loop
{
	public static void main(String args[])
	{
		for(int i = 1; i<=10 ; i++){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter marks : ");
		int marks = input.nextInt();
		
		if(marks < 50){
			System.out.println("Fail !");
		}
		else if(marks >= 50 && marks < 60){
			System.out.println("E");
		}
		else if(marks >= 60 && marks < 70){
			System.out.println("D");
		}
		else if(marks >= 70 && marks < 80){
			System.out.println("C");
		}
		else if(marks >= 80 && marks < 90){
			System.out.println("B");
		}
		else if(marks >= 90 && marks < 100){
			System.out.println("A");
		}
		else{
			System.out.println("Invalid input");
		}
	}
	}

}