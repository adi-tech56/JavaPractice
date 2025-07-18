import java.util.Scanner;

import static java.lang.Math.round;


public class Exercise1 {

   static double Miles(int a,double n)
   {
       if (a == 1){
           n = n* 0.621371;
       }
       else if (a==2)
       {
           n = n/0.621371;
       }
       return n;

   }
    static double Pounds(int a,double n)
    {
        if(a==1){
            n = n* 2.20462 ;
        }
        else if(a== 2){
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
        switch (data){
            case 1 : {
                System.out.println("Enter 1 for Km to Miles Or 2 for Miles to Km");
                int d = s.nextInt();
                switch(d){
                    case 1:{
                        System.out.println("Enter the value in Km be converted into Miles");
                        double a = s.nextDouble();
                        System.out.println(a +" KM In Miles : " + Miles(d,a) + " Miles");
                    }
                    break;
                    case 2:
                    {
                        System.out.println("Enter the value in Miles be converted into KM");
                        double a = s.nextDouble();
                        System.out.println(a +"  Miles  In KM: " + Miles(d,a) + " Km");
                    }
                    break;
                    default:{
                        System.out.println("Invalid Input");
                    }
                }

            }
            break;
            case 2: {
                System.out.println("Enter 1 for Kg to Pounds Or 2 for Pounds to Kg");
                int d = s.nextInt();
                switch(d) {
                    case 1: {
                        System.out.println("Enter the value in Kg be converted into Pounds");
                        double a = s.nextDouble();
                        System.out.println(a + " Kg In Pounds : " + Pounds(d, a) + " Pounds");
                    }
                    break;
                    case 2: {
                        System.out.println("Enter the value in Pounds be converted into Kg");
                        double a = s.nextDouble();
                        System.out.println(a + " Pounds In Kg: " + Pounds(d, a) + " Kg");
                    }
                    break;
                    default: {
                        System.out.println("Invalid Input");
                    }
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