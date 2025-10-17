function containsDuplicate(nums) {
    return new Set(nums).size !== nums.length;
}

// Example usage:
const nums = [1, 2, 3, 1];
console.log(containsDuplicate(nums)); // Output: true