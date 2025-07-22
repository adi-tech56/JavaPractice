class Super1{
public void meth1(){
    System.out.println("super Meth1");
}
public void meth2(){
    System.out.println("super Meth2");
}
}
class Sub1 extends Super1{
    @Override
    public void meth2(){
        System.out.println("sub Meth2");
    }

    public void meth3(){
        System.out.println("sub Meth3");
    }
}


public class DynamicMethod {
    public static void main(String[] args) {
        Super1 s = new Sub1();
        s.meth1();
        s.meth2();
    }
}
