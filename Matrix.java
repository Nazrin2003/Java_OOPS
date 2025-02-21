import java.util.Scanner;
public class Matrix{
    public static void main(String arg[]){
        int a[][] =new int[5][5];
        int b[][] =new int[5][5];
        int c[][]=new int[5][5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows and coloumns of first matrix:");
        int row1=s.nextInt();
        int col1=s.nextInt();
        System.out.println("Enter the number of rows and coloumns of second matrix:");
        int row2=s.nextInt();
        int col2=s.nextInt();

        if(row1==row2 && col1==col2){
        System.out.println("Enter the array values(a):");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the array values(b):");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The Final Matrix:");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                System.out.print(c[i][j]+" ");
            }System.out.println("");
        }
    }
    else{
        System.out.println("The matrix size is not equal!");
    }  
    }
}