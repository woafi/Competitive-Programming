public class Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int val = 2;
        int result = removeElement(nums, val);

        // Properly print the modified array
        System.out.println(result);
    }

}
