package graphics;

class Circle implements Shape {
    public double r;

    public void area() {
        double a = 3.17 * r * r;
        System.out.println("Area of Circle: " + a);
    }
}
