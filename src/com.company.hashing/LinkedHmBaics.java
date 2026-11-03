import java.util.HashMap;
import java.util.LinkedHashMap;
//maintains order of insertion
//A LinkedHashMap in Java is a data structure that extends HashMap to store key-value pairs while keeping a doubly-linked list through all its entries. This extra list runs through the items and preserves the order in which you first put them in.
//uses doubly linked list


public class LinkedHmBaics {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Nepal", 5);
        
        
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        System.out.println(hm);

        System.out.println(lhm);//order remained same
    }
}
