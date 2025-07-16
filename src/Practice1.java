import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //Finding sum of all elements
// int A[] = new int[5];
// int sum = 0;
//        Scanner s =new Scanner(System.in);
//        for (int i=0;i<A.length;i++){
//            A[i] = s.nextInt();
//        }
//        for (int i=0;i< A.length;i++){
//            sum = sum+A[i];
//
//        }
//        System.out.println(sum
//        );
//Finding a element in the array
//         int A[] = new int[5];
//
//        Scanner s =new Scanner(System.in);
//        for (int i=0;i<A.length;i++){
//            A[i] = s.nextInt();
//        }
//        System.out.println("Enter the number you want to find the index of");
//        int B = s.nextInt();
//        for (int i=0;i<A.length;i++){
//          if(A[i]==B){
//              System.out.println("Element found at index :" + i);
////              break;
//              System.exit(0);
//
//          }
//            System.out.println("element not found");//where to place this
//        }
////finding the max element
//        int A[] = new int[4];
//
//        Scanner s =new Scanner(System.in);
//        for (int i=0;i<A.length;i++){
//            A[i] = s.nextInt();
//        }
//        int max = A[0];
//        for (int i=1;i<A.length;i++){
//           if(A[i] > max)
//           {
//               max= A[i];
//           }
//        }
//        System.out.println("the maximum element is"+ max);
//finding the second max element
        int A[] = new int[4];

        Scanner s =new Scanner(System.in);
        for (int i=0;i<A.length;i++){
            A[i] = s.nextInt();
        }
        int max1 = A[0];
        int max2=A[0];
        for (int i=1;i<A.length;i++){
            if(A[i] > max1)
            {
                max2= max1;
                max1=A[i];

            }
            else if (A[i] >max2)
            {
                max2 = A[i];
            }

        }
        System.out.println("the maximum element is"+ max2);

    }
}
