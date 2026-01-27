import java.util.Scanner;

class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter  number: ");
        int num = input.nextInt();

        int sum = 0;
        int i = num;

        while (i != 0) {
            
            int digit = i % 10;
            sum += digit * digit * digit; 
            i = i / 10;
        }
       
        if (sum == num) {
            System.out.println(num + " is armstrong number");
        } else {
            System.out.println(num + " is not armstrong number");
        }
    }
}
