
import java.util.Scanner;

public class Exception_1 {
    public static void main(String[] args) {
//        int a, b, c;
//        Scanner n =  new Scanner(System.in);
//        a = n.nextInt();
//        b = n.nextInt();
//        try {
//
//            c = a / b;
//            System.out.println(c);
//        } catch (ArithmeticException e){
//            System.out.println("division by zero"+e);
//        }

//        int A[] = {1,2,3,4,5,0};
//
//            try {
//                int c = A[0]/A[5];
//                System.out.println(c);
//                System.out.println(A[9]);
//            }
//            catch(ArithmeticException e){
//                System.out.println(e);
//        }
//            catch(ArrayIndexOutOfBoundsException e){
//                System.out.println(e);
//            }
//    }
        int A[] = {1,2,3,4,5,0};

        try {
            int c = A[0]/A[3];
            System.out.println(c);
            try{System.out.println(A[9]);}
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
    }

