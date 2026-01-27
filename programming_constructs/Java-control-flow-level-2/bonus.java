import java.util.Scanner;
class bonus
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = input.nextInt();

        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        if(years > 5)
        {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount : " + bonus);
        }
        else
        {
            System.out.println("No bonus");
        }
    }
}
