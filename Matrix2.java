import java.util.Scanner;
public class Matrix2{
    public static void main(String arg[]){
        int a[][] =new int[5][5];
        int c[][] =new int[5][5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=s.nextInt();
        System.out.println("Enter the number of columns:");
        int col=s.nextInt();
        System.out.println("Enter the array values:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                c[i][j]=a[j][i];
            }
        }
        
        System.out.println("The Final Matrix2:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(c[i][j]+" ");
            }System.out.println("");
        }
        
    }
}