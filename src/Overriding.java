class Super{
    public void display(){
        System.out.println("super Class Display");
    }
        }
class Sub extends Super{
    @Override
    public void display(){
        System.out.println("sub class display");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();
        Sub s = new Sub();
        s.display();
        Super s1 = new Sub();
        s1.display();

    }
}
