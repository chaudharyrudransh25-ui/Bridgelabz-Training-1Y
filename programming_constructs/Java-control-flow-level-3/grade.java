import java.util.Scanner;
class grade{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Physics marks: ");
        int p = input.nextInt();

        System.out.println("Enter Chemistry marks: ");
        int c = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int m = input.nextInt();

        int total = p + c + m;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Level 4, above agency-normalized standards");
        } 
		
        else if (percentage >= 70 && percentage < 79) {
            System.out.println("Level 3, at agency-normalized standards");
        } 
        else if (percentage >= 60 && percentage < 69) {
            System.out.println("Level 2, below but approaching agency-normalized standards");
        } 
        else if (percentage >= 50 && percentage < 59) {
            System.out.println("Level 1, well below agency-normalized standards");
        } 
        else if (percentage >= 40 && percentage < 49) {
            System.out.println("Level 1, too below agency-normalized standards");
        } 
        else {
           
            System.out.println("Remedial standards");
        }
    }
}
