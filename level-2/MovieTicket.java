import java.util.Scanner;
class MovieTicket{
    String movieName;
    int seatNumber;
    double price;
    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }
    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MovieTicket m1 = new MovieTicket();
        m1.movieName = input.nextLine();
        int seat = input.nextInt();
        double cost = input.nextDouble();
        m1.bookTicket(seat, cost);
        m1.displayDetails();
    }
}