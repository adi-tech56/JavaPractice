import java.util.Scanner;

public class Array_Practice {
    public static void main(String Args[]){
        int A[] = new int[4];
        int B[] = {1,2,3,4};
        int C[];

        B[2]=15 ;
//        Scanner s =new Scanner(System.in);
//        for (int i=0;i<A.length;i++){
//            A[i] = s.nextInt();
//        }
//        for(int i = 0;i<A.length;i++)
//        {
//            System.out.println(A[i]);
//        }
//        for(int i = 0;i<B.length;i++)
//        {
//            System.out.println(B[i]);
//        }
//        for(int i :B){
//            System.out.println(i);
//        }
                for(int i = 0;i<B.length;i++)
        {
            System.out.println(B[i]++);
        }
        for(int i :B){
            System.out.println(i);
        }
    }
}
