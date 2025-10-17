function maxSubArray(nums) {
    let maxSum = nums[0]; // Initialize maxSum with the first element
    let currentSum = nums[0]; // Initialize currentSum with the first element

    // Iterate through the array starting from the second element
    for (let i = 1; i < nums.length; i++) {
        // For each element, decide whether to start a new subarray or extend the existing one
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        // Update maxSum if currentSum is larger
        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum;
}

// Example usage:
const nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
console.log(maxSubArray(nums)); // Output: 6