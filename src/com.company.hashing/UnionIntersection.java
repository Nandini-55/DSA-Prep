import java.util.HashSet;

public class UnionIntersection {

    public static void main(String[] args) {
        int[]arr ={7,3,9};
        int[] arr2={6,3,9,2,9,4};

        HashSet<Integer> union= new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        for(int n : arr){
            union.add(n);
        }
        for(int n : arr2){
            if(union.contains(n)){
                intersection.add(n);
            }
            union.add(n);
        }

        System.out.println("Union: "+union);
        System.out.println("Intersection: "+intersection);

        
    }
}
