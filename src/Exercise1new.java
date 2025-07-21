

import java.util.Scanner;

import static java.lang.Math.round;


public class Exercise1new {

    private static double Miles(boolean a,double n)
    {

        if (a ){
            n = n* 0.621371;
        }
        else
        {
            n = n/0.621371;
        }
        return n;

    }
    static double Pounds(boolean a,double n)
    {
        if(a){
            n = n* 2.20462 ;
        }
        else {
            n = n/ 2.20462 ;
        }

        return n;
    }
    static float Celsius(int a,float n)
    {
        if(a==1){
            n = (n-32)* ((float) 5 /9);
        }
        else if(a== 2){
            n = (n*((float) 5 /9))+32;
        }

        return n;
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Type of Conversion Needed");
        System.out.println("1 For Length");
        System.out.println("2 For mass");
        System.out.println("3 for Temperature");
        int data = s.nextInt();
        boolean c = true;
        double result;
        switch (data){
            case 1 : {
                System.out.println("Enter the value in Km to Miles Or vice-versa");
                double a = s.nextDouble();
                System.out.println("Enter 1 for Km to Miles Or 0 for Miles to Km");
                int d = s.nextInt();
                if (d==0){
                    c = false;
                }

                result = c? Miles(c,a):Miles(c,a);
                if (c) {
                    System.out.println(a + " Km In Miles : " + result + " Miles");
                } else {
                    System.out.println(a + " Miles In Km : " + result + " Km");
                }


            }
            break;
            case 2: {

                System.out.println("Enter the value in Kg to Pounds Or vice-versa");
                double a = s.nextDouble();
                System.out.println("Enter 1 for Kg to Pounds Or 0 for Kg to Pounds");
                int d = s.nextInt();
                if (d==0){
                    c = false;
                }

                result = c? Pounds(c,a):Pounds(c,a);
                if (c) {
                    System.out.println(a + " Kg In Pounds : " + result + " Pounds");
                } else {
                    System.out.println(a + " Pounds In Kg : " + result + " Pounds");
                }}


            break;
            case 3: {
                System.out.println("Enter 1 for Fahrenheit into Celsius Or 2 for Celsius to Fahrenheit");
                int d = s.nextInt();
                switch(d) {
                    case 1: {
                        System.out.println("Enter the value in Fahrenheit be converted into Celsius");
                        float a = s.nextFloat();
                        System.out.println(a + " F In C : " + Celsius(d, a) + " C");
                    }
                    break;
                    case 2: {
                        System.out.println("Enter the value in Celsius be converted into Fahrenheit");
                        float a = s.nextFloat();
                        System.out.println(a + " C In F : " + Celsius(d, a) + " F");
                    }
                    break;
                    default: {
                        System.out.println("Invalid Input");
                    }
                }

            }
            break;
            default:{
                System.out.println("invalid input");
            }
        }


    }
}
