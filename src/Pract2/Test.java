package Pract2;
import Pract.Demo;
 class Test1 extends Demo{

    public void show() {
        System.out.println(c+d);
    }
}
public class Test{
    public static void main(String[] args) {
        Test1 t= new Test1();
        t.show();
    }
}