import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        HashSet<Integer> hs  = new HashSet<>();

        int[] arr={4,3,2,5,6,7,3,4,2,1};

        for(int n:arr){
            hs.add(n);
        }

        System.out.println("No. of distinct elements : "+hs.size());
    }
}
