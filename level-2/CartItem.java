import java.util.Scanner;
class CartItem{
    String itemName;
    double price;
    int quantity;
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }
    void removeItem() {
        quantity = 0;
    }
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CartItem c1 = new CartItem();
        String name = input.nextLine();
        double price = input.nextDouble();
        int quantity = input.nextInt();
        c1.addItem(name, price, quantity);
        c1.displayTotalCost();
    }
}