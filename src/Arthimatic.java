import java.sql.SQLOutput;
import java.util.Scanner;

public class Arthimatic {
    public static void main(String[] args) {
//        int a,r,n;
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the first number");
//        a = s.nextInt();
////        System.out.println("enter the difference");
////        d = s.nextInt();
//        System.out.println("enter the common ratio");
//        r = s.nextInt();
//        System.out.println("enter the no of terms");
//        n = s.nextInt();
//        for (int i =0 ; i<n;i++)
//        {
//            System.out.println(a);
////            a= a+d;
//            a = a*r;
//        }
int a=0,b=1,c,n;

        Scanner s = new Scanner(System.in);

        System.out.println("enter the  number of times");
       n = s.nextInt();
        System.out.println(a + " " +b);
       for (int i = 0;i<n;i++)
       {
           c= a+b;
           System.out.println(c);
           a = b;
           b= c;


       }
    }
}
