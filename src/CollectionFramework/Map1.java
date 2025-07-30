package CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(0, "A", 1, "B"));

        tm.put(4, "G");
        tm.put(6, "F");
        System.out.println(tm);
//        System.out.println(tm.ceilingEntry(5).getValue());//Gives the value of the nearest greater key value error if greater value not there
//        System.out.println(tm.ceilingEntry(5));
//        System.out.println(tm.get(4));
    }
}
