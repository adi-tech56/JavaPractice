class Outer{
    int x= 10;
    class Inner{
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+y);
        }
    }
    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}


public class InnerClass {
    public static void main(String[] args) {
     Outer s = new Outer();
     s.outerDisplay();
     Outer.Inner s1= new Outer().new Inner();
     s1.innerDisplay();
    }
}
