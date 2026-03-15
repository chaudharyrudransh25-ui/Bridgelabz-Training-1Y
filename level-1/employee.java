import java.util.Scanner;
 class employee{
    String name;
    int id;
    double salary;
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        employee e1 = new employee();
        e1.name = input.nextLine();
        e1.id = input.nextInt();
        e1.salary = input.nextInt();
        e1.displayDetails();
    }
}