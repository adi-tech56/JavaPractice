class Mythread extends Thread{
    public Mythread(String name){
        super(name);
        setPriority(Thread.MIN_PRIORITY);
    }
    public void run (){
        int count = 1;
        while (true){
            System.out.println(count);
            try{
                sleep(1000);
            }
        catch(InterruptedException e){
            System.out.println(e);
        }
            count ++;
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        Mythread t = new Mythread("Mythread1");
//        System.out.println(t.getId());
//        System.out.println(t.getName());
        t.start();
//        System.out.println(t.getState());
//        System.out.println(t.getPriority());
        t.interrupt();
    }
}
