class NewSuper{
    public void display(){
        System.out.println("super Class Display");
    }
        }
class NewSub1 extends NewSuper{
    @Override
    public void display(){
        System.out.println("sub class display");
    }
}

public class Overriding1 {
    public static void main(String[] args) {
        NewSuper sup = new NewSuper();
        sup.display();
        NewSub1 s = new NewSub1();
        s.display();
        NewSuper s1 = new NewSub1();
        s1.display();

    }
}
