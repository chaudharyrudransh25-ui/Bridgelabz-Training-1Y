import java.util.Scanner;
class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int sum = 0;
        System.out.println("Enter numbers (0 or negative number to stop):");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num <= 0) {
                break;
            }
            arr[count] = num;
            sum += num;
            count++;
        }
        System.out.println("Stored numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum of all numbers = " + sum);
    }
}