import java.util.Scanner;
class Circle{
    double radius;
    void calculate(){
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
        System.out.println("Circumference of Circle: " + circumference);
    }
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.radius = input.nextDouble();
        c1.calculate();
    }
}