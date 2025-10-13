
// Import required for Arrays.toString()
import java.util.*;

public class chcekIfAllCharSame {
    public static boolean areOccurrencesEqual(String s) {
        // HashMap<Character, Integer> pair = new HashMap<>();
        // int i = 0;
        // for (char c : s.toCharArray()) {
        //     pair.put(c, i);
        // }

        // for (int j = 0; j < s.length(); j++) {
        //     int num = pair.get(s.charAt(j));
        //     num++;
        //     pair.put(s.charAt(j), num);
        // }
        // int firstCount = pair.get(s.charAt(0));
        // for (Integer count : pair.values()){
        //     if (count != firstCount){
        //         return false;
        //     }
        // }
        // return true;





        int[] counts = new int[26];

        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        int freq = 0;
        for (int count : counts) {
            if (count > 0) {
                if (freq == 0) {
                    freq = count;
                } else if (count != freq) {
                    return false;
                }
            }
        }
        return true;



    }

    public static void main(String[] args) {
        String str = "aaabbb";
        System.out.println(areOccurrencesEqual(str));
    }
}
