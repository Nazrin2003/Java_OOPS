package graphics;

class Rectangle implements Shape {
    public double l;
    public double b;

    public void area() {
        double a_r = l * b;
        System.out.println("Area of Rectangle: " + a_r);
    }
}
