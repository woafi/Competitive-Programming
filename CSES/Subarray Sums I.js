const prompt = require("prompt-sync")();

let arr = [2, 4, 1, 2, 7]
let n = arr.length;

let prefix = new Array(n).fill(0)
for (let i = 1; i <= arr.length; i++) {
    prefix[i] = prefix[i-1] + arr[i-1]
}

console.log(prefix)

let cnt = new Map();
cnt.set(0, 1)
let ans = 0;
for (let i = 1; i < prefix.length; i++) {
    let sumMins = prefix[i] - 7;
    if (cnt.get(sumMins) == null){
        cnt.set(sumMins, 0)
    }
    let num = cnt.get(sumMins)
    ans += num;
    if (cnt.get(prefix[i]) == null){
        cnt.set(prefix[i], 0)
    }
    let newNum = cnt.get(prefix[i])
    newNum++;
    cnt.set(prefix[i], newNum)
}

console.log(ans)
console.log(cnt)

// https://cses.fi/problemset/task/1660/