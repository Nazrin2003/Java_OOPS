import java.util.Scanner;
class Student {
    int rollno;
    String name;
    String section;
    
    Student(int rollno, String name, String section) {
        this.rollno = rollno;
        this.name = name;
        this.section = section;
    }

    public void display() {
        System.out.println(this.rollno + "\t" + this.name + "\t" + this.section);
    }
}

class Mainpgm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1 = new Student(1, "Anjel", "MCA-B");
        Student s2 = new Student(2, "Roy", "MCA-B");
        Student s3 = new Student(3, "John", "MCA-B");

        Student s[]= new Student[2];
        
        for(int i=0;i<2;i++){
            System.out.println("Enter Details of Student "+(i+1)+":");
            System.out.print("Rollno: ");
            int rollno = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Section: ");
            String section = sc.nextLine();
            s[i] = new Student(rollno, name, section);
        }

        System.out.println("Student Details:");
        System.out.println("Rollno\tName\tSection");
        s1.display();
        s2.display();
        s3.display();
        for(int i=0;i<2;i++){
            s[i].display();
        }
    }
}


// ------------------------------------------------------------
// OUTPUT
// developer@ccfl6-pc24:~/MCA_B22/java/Ex$ javac Mainpgm.java
// developer@ccfl6-pc24:~/MCA_B22/java/Ex$ java Mainpgm
// Enter Details of Student 1:
// Rollno: 4
// Name: Anya
// Section: MCA-A
// Enter Details of Student 2:
// Rollno: 5
// Name: Meg  
// Section: MCA-A
// Student Details:
// Rollno  Name    Section
// 1       Anjel   MCA-B
// 2       Roy     MCA-B
// 3       John    MCA-B
// 4       Anya    MCA-A
// 5       Meg     MCA-A
// -------------------------------------------------------------