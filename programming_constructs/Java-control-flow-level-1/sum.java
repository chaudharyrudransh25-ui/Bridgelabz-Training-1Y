import java.util.Scanner;
class sum
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double total = 0,n = 1;
        while(n!=0)
        {
            n = input.nextDouble();
            total += n;
        }
        System.out.println(total);
    }
}
