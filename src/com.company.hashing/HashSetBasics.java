import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {
    // HashSet  - data structure which stores unique elements(no duplicates) in undorderd way.
    // Null value is allowed
    //Implemented using HashMap - key is the element added and value is random 

    //Iteration on Hashset:- two methods:
    //i)using Iterators
    //ii)using Enhanced for loop(for each)
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(2);
        hs.add(99);
        hs.add(4);

        // System.out.println(hs);

        // System.out.println(hs.size());

        // System.out.println(hs.contains(2));

        // System.out.println(hs.remove(4));
        // System.out.println(hs.size());
        // hs.clear();
        // System.out.println(hs.size());
        //--------------------
        //Iteration methods:
        //i)Iterator:

        Iterator<Integer> it = hs.iterator();
        //Iteratore by default points to a random value - then its next is the object's 1st value and so on and the last value points to null 

        // it->null->1->2->3->99->4->null
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //ii)Enhanced for loop

        for (Integer val : hs) {
            System.out.println(val);
        }

    }
}