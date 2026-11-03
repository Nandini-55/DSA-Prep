import java.util.HashSet;
import java.util.LinkedHashSet; //uses doublly linked list to m aintain elements in same order as added
//insertion and deletion time complexity = O(1)
public class LinkedHsBasics {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Edinburg");
        hs.add("New york");
        hs.add("Edinburg");
        hs.add("Paris");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Edinburg");
        lhs.add("New york");
        lhs.add("Paris");
        lhs.add("Edinburg");

        lhs.remove("New york");

        System.out.println(hs);
        System.out.println(lhs);
    }
}
