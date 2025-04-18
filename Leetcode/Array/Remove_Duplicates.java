import java.util.Arrays;

public class Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        int k = 1; 
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 2, 2, 2 };

        int result = removeDuplicates(nums);

        // Properly print the modified array
        System.out.println(result);
    }
}
