import java.util.Scanner;
class harshad 
{
    public static void main(String args[]) 
	{
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter number: ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num; 
       
        while (temp != 0){
            int digit = temp % 10; 
            sum += digit;          
            temp = temp / 10;      
        }

        if (num % sum == 0) {
            System.out.println(num + "harshad number");
        } 
		else {
            System.out.println(num + "not harshad Number");
        }
    }
}
