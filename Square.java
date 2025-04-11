package graphics;

class Square implements Shape {
    public double s;

    public void area() {
        double a = s * s;
        System.out.println("Area of square: " + a);
    }

}
