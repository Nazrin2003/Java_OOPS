import java.util.Scanner;
interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;

    public void area() {
        double a = 3.17 * r * r;
        System.out.println("Area of Circle: " + a);
    }
    public void perimeter() {
        double p = 2 * Math.PI * r;
        System.out.println("Perimeter of Circle: " + p);
    }
}

class Rectangle implements Shape {
    double l;
    double b;

    public void area() {
        double a_r = l * b;
        System.out.println("Area of Rectangle: " + a_r);
    }

    public void perimeter() {
        double p_r = 2 * (l + b);
        System.out.println("Perimeter of rectangle: " + p_r);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate area and perimeter of a Circle");
            System.out.println("2. Calculate area and perimeter of a Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    Circle c1 = new Circle();
                    System.out.print("Enter the radius of the circle: ");
                    c1.r = scanner.nextDouble();
                    c1.area();
                    c1.perimeter();
                    break;

                case 2:
                    Rectangle r1 = new Rectangle();
                    System.out.print("Enter the length of the rectangle: ");
                    r1.l = scanner.nextDouble();
                    System.out.print("Enter the breadth of the rectangle: ");
                    r1.b = scanner.nextDouble();
                    r1.area();
                    r1.perimeter();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }while(ch!=3);
    }
}
