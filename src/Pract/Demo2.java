package Pract;
import Pract.Demo;
public class Demo2 {
    public static void main(String[] args) {
        Demo d2 = new Demo();
        System.out.println(d2.a  + d2.c +d2.d);
    }



}
class Demo3 extends Demo{
  public void display(){
      System.out.println(a+c+d);
  }
}