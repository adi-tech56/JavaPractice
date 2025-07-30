package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(20,23,47));
        al1.add(10);
        al1.add(0, 20);
        al1.addAll(1,al2);
        System.out.println(al1);
        System.out.println(al1.contains(34));
//        Iterator<Integer> it = al1.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        al1.forEach(n-> show(n));
//        System.out.println(al1);
    }
    static void show(int n){
        if(n>30){
            System.out.println(n);
        }
    }
}
