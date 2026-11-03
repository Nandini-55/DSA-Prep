import java.util.HashMap;

public class ValidAnagram {
    public static void checkAna(String a, String b){
          if (a.length() == b.length()) {
            System.out.print("Not Anagram");
            return;
        }
        HashMap<Character, Integer> hma = new HashMap<>();

        for (char ch : a.toCharArray()) {
            hma.put(ch, hma.getOrDefault(ch, 0) + 1);
        }
        for (char ch : b.toCharArray()) {
            if (hma.containsKey(ch)) {
                if (hma.get(ch) == 1) {
                    hma.remove(ch);
                } else {
                    hma.put(ch, hma.get(ch) - 1);
                }
            } else {
                System.out.print("not Anagram");
                return;
            }
        }

        if (hma.isEmpty()) {
            System.out.print("Anagram");
        } else {
            System.out.print("Not Anagram");
        }

    }
    public static void main(String[] args) {
        String a = "tbbb";
        String b = "care";

        checkAna(a, b);


        
    }
}
