let arr = [2, 1, 2, 1, 3]

let result = 0;

arr.forEach((value) => {
    result ^= value;
})
console.log(result)