import java.util.Scanner;
public class ArrayIndexOutOfBoundsException{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of names: ");
            int n = sc.nextInt();

            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = sc.next();
            }

            System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
            System.out.println("Accessing invalid index: " + names[n]);


        }


}