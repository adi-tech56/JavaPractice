package CollectionFramework;

import java.util.*;

public class LInkedList1 {

    public static void main(String[] args) {

        LinkedList<Integer> al2 = new LinkedList<>();
        al2.add(0,10);
        al2.addFirst(90);
        al2.addLast(98);
        System.out.println( al2.descendingIterator());
                Iterator<Integer> it = al2.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(al2);

        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.offerLast(10);
        d.offerLast(20);
        d.offerFirst(21);
        d.forEach((x)->System.out.println(x));

    }


}
