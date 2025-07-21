import java.util.Scanner;

public class Class_Practice {
    public static void main(String[] args) {
        Circle c1= new Circle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius");
        c1.radius = s.nextInt();
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
 class Circle{
public double radius;
public double area(){
    return Math.PI*radius*radius;

}
public double perimeter(){
    return Math.PI*2*radius;
}
}