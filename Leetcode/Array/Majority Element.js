let nums = [2,2,1,1,1,2,2];
let count = 1;
    let el = nums[0];

    for(let i = 1; i < nums.length; i++) {
        let cur = nums[i];

        if(cur != el) {
            count -= 1;

            if(count == 0) {
                count = 1;
                el = cur;
            }
        } else {
            count += 1;
        }
    }

    console.log(el)