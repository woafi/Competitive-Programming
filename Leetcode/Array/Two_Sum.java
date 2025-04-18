public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            int newNum = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == newNum) {
                    return new int[] {i, j};
                }
            }
        }
        return nums; 
    }

    public static void main(String[] args) {
        // Define an array and a target
        int[] nums = {3,2,3};
        int target = 6;

        // Create an instance of the test class
        Two_Sum obj = new Two_Sum();

        // Call the twoSum method
        int[] result = obj.twoSum(nums, target);

        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
