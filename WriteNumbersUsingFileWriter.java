import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteNumbersUsingFileWriter {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int a[] = new int[10];
        try {
            FileWriter writer = new FileWriter("numbers.txt");
            System.out.println("Enter the number of times you want to enter:");
            int n = sc.nextInt();
            System.out.println("Enter the numbers:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                writer.write(a[i] + " ");
            }

            writer.close();
            System.out.println("Numbers written to file using FileWriter.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
