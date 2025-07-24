package JavaLAng;

@FunctionalInterface
interface MyLambda{
    public void display();
}
@FunctionalInterface
interface MyLambda1{
    public void display(String str);
}
class New implements MyLambda{
    public void display(){
        System.out.println("Hello World");
    }
}
public class Lambda {
    public static void main(String[] args) {
        MyLambda m = () -> //Lambda expression
        {
            {
                System.out.println("Hello World");
            }
        };
        m.display();
        MyLambda1 n = (s) -> {
            {
                System.out.println(s);
            }
        };
        n.display("Hello");
    }
}