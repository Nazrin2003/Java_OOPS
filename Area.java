import java.util.Scanner;
public class Area{
    public void area(double r){
        System.out.println("Area of circle with radius "+r+" is: "+3.14*r*r);
    }
    public void area(int s){
        System.out.println("Area of square with side "+s+" is: "+s*s);
    }
    public void area(int l,int b){
        System.out.println("Area of rectangle with length "+l+" and breadth "+b+" is: "+l*b);
    }
    public void area(double bs,double h){
        System.out.println("Area of triangle with base "+bs+" and height "+h+" is: "+0.5*bs*h);
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following:");
        System.out.print("Radius: ");
        double r = sc.nextDouble();
        sc.nextLine();
        System.out.print("Side: ");
        int s = sc.nextInt();
        sc.nextLine();
        System.out.print("Length: ");
        int l = sc.nextInt();
        sc.nextLine();
        System.out.print("Breadth: ");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.print("Base: ");
        double bs = sc.nextDouble();
        sc.nextLine();
        System.out.print("Height: ");
        double h = sc.nextDouble();
        sc.nextLine();

        Area a1= new Area();
        a1.area(r);
        a1.area(s);
        a1.area(l,b);
        a1.area(bs,h);
    }
}
