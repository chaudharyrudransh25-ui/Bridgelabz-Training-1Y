import java.util.Scanner;
class spring{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int day = input.nextInt();
		if(month == 3){
			if(day >= 20 && day <= 31){
				System.out.print("spring season");
			}
		}
	    else if(month == 6){
            if(day >= 0 && day <= 20){
				System.out.print("spring season");
			}	    
		}
		else if(month > 3 && month < 6){
			System.out.print("spring season");
		}
		else{
			System.out.print("no spring season");
		}
	}
}