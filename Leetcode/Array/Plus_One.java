import java.util.*;

public class Plus_One {
    public static int[] func(int[] digits) {
        int n = digits.length;

        // Start from the last digit and move to the left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment the digit
                return digits; // No carry, return the result
            }
            digits[i] = 0; // Set to 0 and carry over
        }

        // If we're here, it means all digits were 9 (e.g., 999 -> 1000)
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the first digit to 1
        return newDigits;
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1,0};

        int[] result = func(nums);

        // Properly print the modified array
        System.out.println(Arrays.toString(result));
    }
}