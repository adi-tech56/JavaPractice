interface Member{
public void callback();
}

class store {
    Member mem[] = new Member[10];
    int count =0 ;
    void register(Member m){
        mem[count ++] = m;
    }
    void inviteSale(){
        for(int i =0;i<count;i++){
            mem[i].callback();
        }
    }
}
class customer implements Member{
    String name;
customer(String n){
    name = n;
}
//    @Override
    public void callback() {
        System.out.println("Ok I wil visit"+ name);
    }

}

public class Interface_example {
    public static void main(String[] args) {
        store s = new store();
        customer c1 = new customer("John");
        customer c2 = new customer("Mickkel");
        customer c3 = new customer("Hiro");
        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.inviteSale();
    }
}
