//Finding the prime number,gcd and max
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class PrimeNum {

    static boolean isPrime(int n ){

        for(int i=2;i<=(n/2);i++)
        {
            if(n%i == 0 )
                return false;
        }
        return true;
    }
static int GCD(int a,int b)
{

    while (a != b){
        if(a >b)
        {
            a = a-b;
        }
        else if (b>a)
        {
            b = b-a;
        }
    }
    return a;
}


    static int Max(int a,int b){
    if(a>b)
    {
        return a;
    }
    else  {
        return b;
    }

    }
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.println("enter two numbers");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Enter 1 to check if the numbers are prime");
        System.out.println("Enter 2 to check the GCD of the numbers");
        System.out.println("Enter 3 to check  the max element");
        int n = s.nextInt();
        switch (n) {
            case 1 : {
               boolean x= isPrime(a);
               if(x)
               {
                   System.out.println("Prime Number"+ a);
               }
               else{
                   System.out.println("Non Prime Number"+ a);
               }
                boolean y= isPrime(b);
                if(y)
                {
                    System.out.println("Prime Number"+ b);
                }
                else{
                    System.out.println("Non Prime Number"+ b);
                }
            }
            break ;
            case 2: {
                if(a > 0 && b >0)
                {
                    int c = GCD(a,b);
                    System.out.println("The GCD IS"+c);
                }
                else {
                    System.out.println("GCD for number 0 or Negative is undefined");
                }


            }
            break;
            case 3: {
                int c = Max(a,b);
                System.out.println("Max number is "+ c);
            }
            break;
            default :
                System.out.println("Enter a Valid number");
        }


    }
}
