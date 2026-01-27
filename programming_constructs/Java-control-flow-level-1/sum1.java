import java.util.Scanner;
class sum1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double i = 0;
		double n;
        while(true)
        {
            n = input.nextDouble();
            if(n <= 0){
				break;
			}
            i+=n;
        }
        System.out.println(i);
    }
}
