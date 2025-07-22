import java.util.Scanner;

public class Data_hiding {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length & breadth");
        int a = s.nextInt();
        int b =s.nextInt();
        r.setLength(a);
        r.setBreadth(b);
        System.out.println(r.area());
        System.out.println(r.perimeter());

    }
}
class Rectangle{
    private int Length;
    private int breadth;
    public int getLength(){
        return Length;
    }
    public void setLength(int a){
        if(a>=0){
            Length = a;
        }
        else Length=0;

    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        if(b>=0){
            breadth = b;
        }
        else breadth=0;
    }


    public double area(){
        return Length*breadth;

    }
    public double perimeter(){
        return 2*(Length+breadth);
    }
}