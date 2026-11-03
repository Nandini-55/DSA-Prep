import java.util.HashMap;

public class SubarraySum {
    public int countSubs(int[] arr, int k) {
        if (arr.length == 1) {

            return arr[0] == k ? 1 : 0;

        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

        }

        return count;

    }
}
