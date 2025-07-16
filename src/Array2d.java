import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the array");
        int row = s.nextInt();
        int col = s.nextInt();
        System.out.println("Enter the array elements for A");
        int[][] A = new int[row][col];
        int[][] B = new int[row][col];
        int[][] sum =new int[row][col];
        for(int x = 0; x<row ;x++){
            for(int y = 0 ;y<col ;y++)
            {
                A[x][y] = s.nextInt();
            }
        }
        System.out.println("Enter the array elements for B");
        for(int x = 0; x<row ;x++){
            for(int y = 0 ;y<col ;y++)
            {
                B[x][y] = s.nextInt();
            }
        }
        for(int x = 0; x<row ;x++){
            System.out.print("|");
            for(int y = 0 ;y<col ;y++)
            {
                sum [x][y] = A[x][y] + B[x][y];
                System.out.print(sum[x][y] + " ");
            }
            System.out.println("|");
        }
    }
}
