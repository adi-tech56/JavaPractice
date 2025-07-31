package CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache1 {
    public static void main(String[] args) {
//        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f,true)
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,0.75f){
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };
        lhm.put(1,"F");
        lhm.put(2,"G");
        lhm.put(3,"A");
        lhm.put(4,"S");
        lhm.put(5,"H");
        lhm.put(6,"R");
//        lhm.put(7,"H");
//        lhm.put(8,"J");
//        lhm.put(9,"K");
        String s= lhm.get(2);
        s = lhm.get(5);

lhm.forEach((k,v)-> System.out.println(k+" "+ v));





    }
}
