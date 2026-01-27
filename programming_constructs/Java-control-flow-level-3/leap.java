import java.util.Scanner;
class leap
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = input.nextInt();

       if(year % 100 == 0){
		   if(year % 400 == 0){
			   System.out.println("leap year");
		   }
		   else{
			   System.out.println("not leap year");
		   }
	   }
	   
	   else{
		   if(year % 4 == 0){
			   System.out.println("leap year");
		   }
		   else{
			   System.out.println("not leap year");
	   }
	}

	}
}