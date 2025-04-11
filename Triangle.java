package graphics;

class Triangle implements Shape {
    public double b;
    public double h;

    public void area() {
        double a = (b * h)/2;
        System.out.println("Area of Triangle: " + a);
    }
}
