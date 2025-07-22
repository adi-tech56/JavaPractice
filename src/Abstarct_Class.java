abstract class Shape{
    abstract double perimeter();
    abstract double area();

}

class circle extends Shape{
    float radius;
    double area(){
        return Math.PI*radius*radius;

    }
    double perimeter(){
        return Math.PI*2*radius;
    }
}
class rectangle extends Shape{
   double length,breadth;
    double area(){
        return length*breadth;

    }
    double perimeter(){
        return ((2 *(length + breadth)));
    }
}

public class Abstarct_Class {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.breadth=5;
        r.length= 10;

        System.out.println(r.perimeter());

        System.out.println(r.area());
        circle c = new circle();
        c.radius = 5;
        System.out.println(c.area());
        System.out.println(c.perimeter());

    }
}
