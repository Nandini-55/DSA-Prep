import java.util.HashMap;
import java.util.TreeMap;//Store keys in sorted order 
//put , get, remove - Time complexity - O(log n)
//uses Red Black tree - self balancing tree

public class TreeMapBasics {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Nepal", 5);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        System.out.println(hm);

        System.out.println(tm);// order remained same
    }
}
