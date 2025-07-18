import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
//        int [] A = new int[5];
        int [] A = {4,2,8,1,3};
        int n = A.length;
//        Scanner s = new Scanner(System.in);
//        for (int i = 0 ;i< n; i++)
//        {
//            A[i] = s.nextInt();
//        }
        //sorting

        for(int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++){
                if (A[j] > A[j + 1]){
                    int temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(A));

//        for (int i = 1; i < n; ++i) {
//            int key = A[i];
//            int j = i - 1;
//
//            while (j >= 0 && A[j] > key) {
//                A[j + 1] = A[j];
//                j = j - 1;
//            }
//           A[j + 1] = key;
//        }
//
////        for(int i = n-1;i > 0 ; i--)
////        {
////            A[i] =A[i-1];
////        }
////        A[0] = temp;
//        for (int i = 0 ;i< n; i++)
//        {
//            System.out.print(A[i]+ " ");
//        }
////        int temp = A[n-1];
//        for (int i = 0;i<(n/2);i++)
//        {
//            int t = A[i];
//           A[i]=A[n-1-i] ;
//            A[n-1-i] = t;
//        }
////        A[0] = temp;
//        System.out.println( " ");
//        for (int i = 0 ;i< n; i++)
//        {
//            System.out.print(A[i]+ " ");
//        }
    }
}
