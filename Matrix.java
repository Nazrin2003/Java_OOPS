import java.util.Scanner;
public class Matrix{
    public static void main(String arg[]){
        int a[][] =new int[5][5];
        int b[][] =new int[5][5];
        int c[][]=new int[5][5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=s.nextInt();
        System.out.println("Enter the number of columns:");
        int col=s.nextInt();
        System.out.println("Enter the array values(a):");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the array values(b):");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                b[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The Final Matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(c[i][j]+" ");
            }System.out.println("");
        }
        
    }
}