import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10]; 

        try {            
            FileWriter writer = new FileWriter("numbers.txt");
            System.out.println("Enter the number of times you want to enter (up to 10):");
            int n = sc.nextInt();             
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); 
                writer.write(a[i] + " "); 
            }
            writer.close(); 
                       
            FileWriter evenWriter = new FileWriter("even_numbers.txt");
            FileWriter oddWriter = new FileWriter("odd_numbers.txt");
                                  
            File file = new File("numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 2 == 0) { 
                    evenWriter.write(num + "\n");  
                } else { 
                    oddWriter.write(num + "\n"); 
                }
            }
           
            scanner.close();
            evenWriter.close();
            oddWriter.close();

            System.out.println("Even numbers written to even_numbers.txt");
            System.out.println("Odd numbers written to odd_numbers.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close(); 
        }
    }
}
