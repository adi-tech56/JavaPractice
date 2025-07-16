public class Array2 {
    public static void main(String[] args) {
//        int A[] = new int[4];
//        int B[] = {1,2,3,4};
//        int n = B.length;
//        for(int i =0;i <n;i++)
//        {
//            A[i] = B[i];
//            System.out.println(A[i] +"A"+i);
//        }
        //left shift
//int A[] = {1,2,3,4};
//int temp = A[0];
//int n = A.length;
//        for(int i =0 ; i<n;i++)
//        {
//            System.out.print(A[i]);
//        }
//        System.out.println("|");
//for(int i = 1;i < n ; i++)
//{
//    A[i-1] =A[i];
//}
//A[n-1] = temp;
//for(int i =0 ; i<n;i++)
//{
//    System.out.print(A[i]);
//}
        //right shift
        int A[] = {1,2,3,4};

        int n = A.length;
        int temp = A[n-1];
        for(int i =0 ; i<n;i++)
        {
            System.out.print(A[i]);
        }
        System.out.println("|");
        for(int i = n-1;i > 0 ; i--)
        {
            A[i] =A[i-1];
        }
        A[0] = temp;
        for(int i =0 ; i<n;i++)
        {
            System.out.print(A[i]);
        }

    }

}
