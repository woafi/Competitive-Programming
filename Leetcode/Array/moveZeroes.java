import java.util.Arrays;

public class moveZeroes {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
            if(nums[i] == 0){
                zeroCount++;
            }
        }
        int size = count + zeroCount;
        for(int i = count; i < size; i++){
            nums[i] = 0;
        }
        
    }

    public static void main(String[] args) {
        // Define an array and a target
        int[] nums = { 0, 1, 0, 3, 12 };

        // Create an instance of the test class
        moveZeroes(nums);

        // Print the result
        System.out.println(Arrays.toString(nums));
    }
}
