package CollectionFramework;

import java.util.HashSet;

public class Hash1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(4,0.25f);
        hs.add(18);
        hs.add(20);
        hs.add(11);
        hs.add(98);
        hs.add(32);
        hs.add(23);
        hs.add(25);
        hs.add(82);


        System.out.println(hs);


    }
}
