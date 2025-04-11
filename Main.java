import graphics.*;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();
        Square s1 = new Square();
        Circle c1 = new Circle();

        r1.l = 4;
        r1.b = 5;
        r1.area();

        t1.b = 3;
        t1.h = 6;
        t1.area();

        s1.s = 4;
        s1.area();

        c1.r = 4;
        c1.area();
    }
}
