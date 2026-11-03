import java.util.TreeSet;//sorted in ascending order , null values not allowed
//uses tree map which uses red black tree (self balancing) 
//insertion and deletion time complexity = O(log n)
public class TreeSetBasics {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Edinburg");
        ts.add("New york");
        ts.add("Edinburg");
        ts.add("Paris");
        ts.add("Mumbai");
        // ts.add(null); -Exception in thread "main" java.lang.NullPointerException

        System.out.println(ts);
    }
}
