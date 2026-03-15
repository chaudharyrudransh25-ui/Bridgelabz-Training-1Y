import java.util.Scanner;
class inventory{
    int itemCode;
    String itemName;
    double price;
    void displayItem(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        inventory i1 = new inventory();
        i1.itemCode = input.nextInt();
		input.nextLine();
		i1.itemName = input.nextLine();
        i1.price = input.nextDouble();
        int quantity = input.nextInt();
        i1.displayItem(quantity);
    }
}