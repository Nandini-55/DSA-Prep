// Hashing refers to changing the form of data. 
// Hashing is characterised into types:
// 1.Maps :Which are further categorized into three types:
            // 1. HashMap
            // 2. LinkedHashMap - keys are inserted in order  
            // 3. TreeMap
// 2.Sets :Which are further categorized into three types:
            // 1. HashSet
            // 2. LinkedHashSet
            // 3. TreeSet

// The important ones are hashmap and hashset. Others just have some different properties but are similar. 
// HashMap :  It stores data in key : value pair , where each key is unique but value can be repeated- can be visualised as table or node
// Time complexity of insert(put)  , remove and search or get is O(1)- constant 


//*Note* - Sometimes the time complexity of a hash map goes to O(N) because the bucket index given by the hashing function always returns the same value, not due to any error, but due to some keys which return the same bucket index.Although it is rare , but still if interviewer asks 
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Basics {

     public static void main(String[] args) {
        //Creating Hashmap :- 
        // syntax - HashMap<key_datatype , value_datatype> name = new Hashmap<>();
        HashMap<String , Integer > hm = new HashMap<>();

        //Insert 
        hm.put("India",100 );
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Bhutan", 6);
        hm.put("Nepal",5);

        //print
        System.out.println(hm); //output - {Bhutan=6, China=150, US=50, Nepal=5, India=100} - randomly stored

        //Get - O(1)
        //syntax : hm.get("key");
        int population = hm.get("India");
        System.out.println(population);

         System.out.println(hm.get("Indonesia")); //return null if no vlue exists

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false

        //Remove - O(1)
        //  System.out.println(hm.remove("US"));//returns 50
         System.out.println(hm);
        System.out.println(hm.remove("Indonesia"));// returns null
        System.out.println(hm);

        //Size 
        System.out.println(hm.size());

        //Is Empty
        System.out.println(hm.isEmpty());//false

        // hm.clear();//empty it 
        // System.out.println(hm.isEmpty());


        //Iterate through hashmap
        Set<String> keys = hm.keySet();//stores all keys
        System.out.println(keys);//[Bhutan, China, US, Nepal, India]- random 

        for (String k : keys) {
            System.out.println("key: "+k+" value:"+hm.get(k)) ;
        }

        //or 
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
        String key = entry.getKey();     // Accesses the key
        Integer value = entry.getValue(); // Accesses the value
        System.out.println(key + " : " + value);
}
 

    }
}
