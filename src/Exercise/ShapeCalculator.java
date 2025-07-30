package Exercise;

import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();

}

class Circle extends Shape {
    private double r;

    public Circle(double radius) {
        r = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    private double l, b;

    public Rectangle(double l, double b) {
        this.l = l;
        this.b = b;

    }

    @Override
    public double calculateArea() {
        return l * b;
    }
}

class Square extends Shape {
    private double l;

    public Square(double s) {
        l = s;
    }

    @Override
    double calculateArea() {
        return l * l;
    }
}

public class ShapeCalculator {
    private static void userDisplay() {
        Scanner s = new Scanner(System.in);
        boolean y = true;
        while (y) {
            System.out.println("enter which shape area you need to find");
            System.out.println("1 for Circle, 2 for Rectangle, 3 for square ");
            int p = s.nextInt();
            switch (p) {
                case 1: {
                    System.out.println("enter the radius");
                    double r = s.nextDouble();
                    Circle n = new Circle(r);
                    System.out.println(n.calculateArea());
                }
                break;
                case 2: {
                    System.out.println("enter the length and Breadth of the rectangle");
                    double l = s.nextDouble();
                    double b = s.nextDouble();
                    Rectangle n = new Rectangle(l, b);
                    System.out.println(n.calculateArea());
                }
                break;
                case 3: {
                    System.out.println("enter the length of the square");
                    double l = s.nextDouble();

                    Square n = new Square(l);
                    System.out.println(n.calculateArea());
                }
                break;
                default: {
                    System.out.println("enter valid number for the shape");
                }
            }


            System.out.println("Want to calculate other areas enter 1 or 0 to exist");
            int x = s.nextInt();
            if (x == 0) {
                y = false;
            }


        }

    }

    public static void main(String[] args) {

        userDisplay();
    }
}
