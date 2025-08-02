package Exercise;

import java.util.Scanner;

public class OrderProcessing {
    class CustomerOrder extends Thread {
        private String threadName;

        public CustomerOrder(String name) {
            this.threadName = name;
        }

        @Override
        public void run() {
            System.out.println(threadName + " started.");
            try {
                // Simulate 3 seconds of processing time
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
            System.out.println(threadName + " processed.");
        }
    }

    static void threadMethod(String orderId) {
        OrderProcessing op = new OrderProcessing();
        OrderProcessing.CustomerOrder thread1 = op.new CustomerOrder(orderId);
        thread1.start();
    }

    ;

    public static void main(String[] args) {
        System.out.println("Main thread started.");
        int enter = 1;
        do {
            System.out.println("Enter 1 to order and 0 to exit");
            Scanner s = new Scanner(System.in);
            enter = s.nextInt();
            s.nextLine();
            System.out.println("Enter  order id");
            String orderId = s.nextLine();
            threadMethod(orderId);
        } while (enter != 0);


        System.out.println("Main thread finished.");
    }

}
