import java.util.HashMap;
import java.util.HashSet;

public class FindPath {

    public static void main(String[] args) {
        HashMap <String,String> hm = new HashMap<>();

        hm.put("Chennai","Bengluru");
        hm.put("Mumbai","Delhi");
        hm.put("Goa","Chennai");
        hm.put("Delhi","Goa");


        //step1- find the starting point - key that doesn't exists as value
        String start="";
        HashSet<String> to=new HashSet<>();
        for (String city : hm.keySet()) {
            to.add(hm.get(city));
        }
        for (String city : hm.keySet()) {
            if(!to.contains(city)){
                start=city;
            }
        }

        //Step 2 - find path
System.out.print(start);
        while(hm.containsKey(start)){
            start=hm.get(start);
            System.out.print("->"+start);
        }
    }
}
