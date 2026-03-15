import java.util.Scanner;
class Circle{
    double radius;
    Circle() {
        this(5);
    }
    Circle(double r) {
        radius = r;
    }
    void display() {
        System.out.println("Radius: " + radius);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        Circle c1 = new Circle();
        Circle c2 = new Circle(r);
        c1.display();
        c2.display();
    }
}