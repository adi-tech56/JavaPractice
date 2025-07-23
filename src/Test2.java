//
//class Thread1 extends Thread{
//    public void run (){
//        int i =1;
//        while(true){
//            System.out.println("hello" + i);
//            i++;
//        }
//    }
//}
//public class Test2 extends Thread{
//
//    public void run (){
//        int i =1;
//        while(true){
//            System.out.println("hello" + i);
//            i++;
//        }
//    }
//    public static void main(String[] args) {
////
////        Thread1 t = new Thread1();
//
//
//        Test2 t = new Test2();
//        t.start();
//        int i =1;
//        while (true){
//            System.out.println("world"+ i);
//            i++;
//
//        }
//    }
//}
public class Test2 implements Runnable{

    public void run (){
        int i =1;
        while(true){
            System.out.println("hello" + i);
            i++;
        }
    }
    public static void main(String[] args) {
//
//        Thread1 t = new Thread1();


        Test2 t = new Test2();
        Thread th = new Thread(t);
        th.start();
        int i =1;
        while (true){
            System.out.println("world"+ i);
            i++;

        }
    }
}
