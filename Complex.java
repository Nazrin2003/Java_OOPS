import java.util.Scanner;
public class Complex{
    public static void main(String arg[]){
        Scanner s= new Scanner(System.in);
        int a,b,c,d,s_r,s_i;
        System.out.println("Enter the real and imaginary part of complex number 1:");   //a + bi
        a = s.nextInt();
        b = s.nextInt(); 

        System.out.println("Enter the real and imaginary part of complex number 2:");   //c + di
        c = s.nextInt();
        d = s.nextInt(); 

        s_r = a+c;  //sum of real part
        s_i = b+d;  // sum of imaginary part

        System.out.println("Sum of two complex numbers is: "+s_r+" + "+s_i+" i");

    }
}