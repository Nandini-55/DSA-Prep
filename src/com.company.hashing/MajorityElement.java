import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElement{

    public static ArrayList<Integer> majorElements(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int key:hm.keySet()){
            if(hm.get(key)>(arr.length/3)){
                res.add(key);
            }
        }
        return res;
    }
    public static void main(String[] args){

        // int[] arr= {1,3,2,5,1,3,1,5,1};
          int[] arr= {1,2};
        ArrayList<Integer> res = majorElements(arr);
        for(int key:res){
            System.out.println(key);
        }
    }
}