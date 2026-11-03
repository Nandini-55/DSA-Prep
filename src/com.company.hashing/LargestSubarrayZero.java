import java.util.HashMap;

public class LargestSubarrayZero {
    // Find largest subarray which has sum 0 and return its length
    public static void main(String[] args) {//O(n)
        int[] arr = { 15, -2, 2, -8, 1, 7, 10 };
        HashMap<Integer, Integer> hm = new HashMap<>();

        int length = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hm.containsKey(sum)) {
                length = Math.max(length, (i - hm.get(sum)));
            } else {
                hm.put(sum, i);
            }
        }

        System.out.println(length);
    }
}
