import java.util.Scanner;
class Vote
{   
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter age : ");
		int age = input.nextInt();
		
	if(age >= 18){
		System.out.println("person's age is" + age + "and can vote");
	}
	
	else{
		System.out.println("person's age is" + age + "and cannot vote");
	}
	
	}
}