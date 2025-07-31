package Exercise;

import java.util.Scanner;

class InsufficientBalance extends Exception{
    public InsufficientBalance( double amount){
     super("Insufficient funds to withdraw" +" " + amount);
    }
}
class UserAccount{
    private String fullName;
    private double balance;

    public UserAccount(String fullName, double balance) {
        this.fullName = fullName;
        this.balance = balance;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdrawFunds(double amount) throws InsufficientBalance {

        if(amount>balance){
            throw new InsufficientBalance(amount);
        }

        this.balance -= amount;
        System.out.println(balance);
    }

}

public class BankingSystem {
    public static void main(String[] args) throws InsufficientBalance {
        System.out.println("enter your name and balance");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        Double Balance = s.nextDouble();
        UserAccount acc1 = new UserAccount(name,Balance);


        int i;
        do{
            System.out.println("enter amount to wthdraw");
            double Ammount = s.nextDouble();
            acc1.withdrawFunds(Ammount);
            System.out.println("Enter 1 to withdraw again or 0 to exist");
            i = s.nextInt();

        }while(i!=0);


        System.out.println("BALANCE FOR "+ acc1.getFullName()+"\'s ACCOUNT IS "+acc1.getBalance()+" USD");
    }
}
