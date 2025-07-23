package Thread;
//Moniter in Multithread
   class MyData{
    public void display (String str){
        synchronized(this){
        for(int i = 0 ; i< str.length();i++){
            System.out.print(str.charAt(i));
            try{Thread.sleep(100);}catch(Exception e){}
        }
    }}
}
class Mythread1 extends Thread{
MyData d;
public Mythread1(MyData d){
    this.d = d;
}
public void run(){
    d.display("HelloWorld");
}

}
class Mythread2 extends Thread{
    MyData d;
    public Mythread2(MyData d){
        this.d = d;
    }
    public void run(){
        d.display("WelcomeAll");
    }

}
public class Example1 {
    public static void main(String[] args) {
   MyData d = new MyData();
   Mythread1 t1 = new Mythread1(d);
   Mythread2 t2 = new Mythread2(d);

   t1.start();
   t2.start();

    }
}
