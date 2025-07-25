//method to calculate the area

import java.util.Scanner;

public class Method_overload {
    public double area(double radius){
        return Math.PI*radius*radius;
    }
    public double area(double a, double b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Enter the coordinates data");
        Scanner s = new Scanner(System.in);
        System.out.println("enter 1 for the java.circle and 2 for the java.rectangle");
        int a = s.nextInt();
            Method_overload Area= new Method_overload();
          if (a==1)  {
                double r = s.nextDouble();
              System.out.println(Area.area(r));
            }
           else if(a==2){
              double c = s.nextDouble();
              double b = s.nextDouble();
              System.out.println(Area.area(b,c));

          }


    }
}
