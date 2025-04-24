function find(nums, target) {
    let newnums = [];
    let left = 0;
    let right = nums.length - 1;
    let first = -1;
    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        if (nums[mid] === target) {
            first = mid;
            right = mid - 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }


    left = 0;
    right = nums.length - 1;
    let last = -1;
    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        if (nums[mid] === target) {
            last = mid;
            left = mid + 1;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    if (first !== -1 && last !== -1) {
        newnums = [first, last];
    } else {
        newnums = [-1, -1];
    }

    return newnums
}
let arr = [1,2, 3, 5,5,5,5,6,8,9];
let target = 5;
console.log(find(arr, target)); 


