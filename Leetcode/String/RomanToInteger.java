
import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {

        HashMap<Character, Integer> pair = new HashMap<>();
        pair.put('I', 1);
        pair.put('V', 5);
        pair.put('X', 10);
        pair.put('L', 50);
        pair.put('C', 100);
        pair.put('D', 500);
        pair.put('M', 1000);

        int number = 0;
        int n = s.length();

        // Iterate through the string
        for (int i = 0; i < n; i++) {
            int currentVal = pair.get(s.charAt(i));

            // Check if the current value is smaller than the next value
            if (i < n - 1 && currentVal < pair.get(s.charAt(i + 1))) {
                number -= currentVal; // Subtract the current value
            } else {
                number += currentVal; // Add the current value
            }
        }

        return number;
    }

    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(romanToInt(str));
    }
}

// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000