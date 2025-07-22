package Pract;

public class Demo {

        int a=10;
        private int b =20;
        protected int c = 30;
        public int d =30 ;
        public void display(){
            System.out.println(a+b+c+d);

    }

    public static void main(String[] args) {
        Demo d3 = new Demo();
        d3.display();
    }

}
