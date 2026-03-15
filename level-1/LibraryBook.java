import java.util.Scanner;
class LibraryBook{
    String title;
    String author;
    double price;
    boolean availability;
    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        availability = true;
    }
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String title = input.nextLine();
        String author = input.nextLine();
        double price = input.nextDouble();
        LibraryBook b1 = new LibraryBook(title, author, price);
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}