package Thread;
class Data{
    int value;
    public void set(int v){

        value = v;
    }
    public int get(){
        int x= 0;
        x = value;
        return x;
    }
}
class Producer extends Thread{
    Data d ;
    public Producer(Data d){
        this.d= d;
    }
    public void run(){
        int count =1;
        while(true){
            d.set(count);
            System.out.println("Producer"+count);
            count++;
        }
    }
}
class Consumer extends Thread{
    Data d ;
    public Consumer(Data d){
        this.d= d;
    }
    public void run(){
    int value;
        while(true){
         value= d.get();
            System.out.println("Consumer" + value);
        }
    }
}
public class Inter_Thread {
    public static void main(String[] args) {

    }
}
