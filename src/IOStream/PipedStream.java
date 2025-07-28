package IOStream;



import java.io.*;

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o)
    {
        os = o;
    }
    public void run(){
        int count =1;
        while(true){
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer"+ count);

                System.out.flush();
                Thread.sleep(100);
                count ++;

            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
class Consumers extends Thread{
   InputStream is;
    public Consumers (InputStream s)
    {
        is =s;
    }
    public void run(){
     int x;
        while(true){
            try {
               x = is.read();

                System.out.println("Consumer"+ x);
                System.out.flush();
                Thread.sleep(100);


            }
            catch (Exception e){
                System.out.println(e);

            }
        }
    }
}


public class PipedStream {
    public static void main(String[] args)  {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        try{pis.connect(pos);}
        catch(IOException e){
            System.out.println(e);
        }
        Producer p = new Producer(pos);
        Consumers c = new Consumers(pis);
        p.start();
        c.start();

    }
}
