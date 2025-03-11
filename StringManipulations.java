import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine(); 

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine(); 

        System.out.println("String Manipulations\n---------------------");
        
        // 1. Concatenation
        String concatanation = str1.concat(" " + str2);
        System.out.println("Concatenated Strings: " + concatanation );

        // 2. Contains 
        System.out.println("Does " + str1 + " contain 'run'? " + str1.contains("run"));

        // 3. Ends With
        System.out.println("Does " + str1 + " end with 'ing'? " + str1.endsWith("ing"));

        // 4. Equals
        System.out.println("Are the two strings equal? " + str1.equals(str2));

        // 5. Length
        System.out.println("Length of "+str1+" string: " + str1.length());

        // 6. Replace
        System.out.println("String '"+str1+"' after replacement: " + str1.replace("run", "spin"));

        // 7. Starts With
        System.out.println("Does the first string start with 'run'? " + str1.startsWith("run"));

        // 8. Substring
        if (str1.length() >= 5) {
            System.out.println("Substring of the first string (0 to 3): " + str1.substring(0, 3));
        } else {
            System.out.println("First string is too short for substring (0 to 5).");
        }

        // 9. To Lowercase
        System.out.println("Second string in lowercase: " + str1.toLowerCase());

        // 10. Trim
        System.out.println("Trimmed  string: '" + concatanation.trim() + "'");

        // Close the scanner
        scanner.close();
    }
}