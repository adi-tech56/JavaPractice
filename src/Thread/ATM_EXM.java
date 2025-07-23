package Thread;

class ATM{
 synchronized public void checkBalance(String name){
//     synchronized (this){
     System.out.println(name + "Checking");
     try{Thread.sleep(1000);}catch(Exception e){}

     System.out.println("Balance");
 }
 synchronized public void withDraw(String name,int ammount){
//     synchronized (this){
         System.out.println(name + "Withdraws" + ammount);
         try{Thread.sleep(1000);}catch (Exception e){}
         System.out.println("Successful");
//     }
 }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int ammount;
    Customer(String n,int amt,ATM a){
        atm = a;
        name = n ;
        ammount = amt;

    }
    public void useAtm(){
        atm.checkBalance(name);
        atm.withDraw(name,ammount);
    }
    public void run(){
        useAtm();
    }


}




public class ATM_EXM {
    public static void main(String[] args) {
        ATM a = new ATM();
        Customer c1 = new Customer("John",1000,a);
        Customer c2= new Customer("Smith",1000,a);
        c1.start();
        c2.start();
    }
}
