import java.util.Scanner;
class Mobile{
    String brand;
    String model;
    double price;
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Mobile m1 = new Mobile();
        m1.brand = input.nextLine();
        m1.model = input.nextLine();
        m1.price = input.nextDouble();
        m1.displayDetails();
    }
}