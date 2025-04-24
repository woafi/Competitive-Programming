let arr = [1, 4, 2, 5, 3];

let prefixSum = new Array(arr.length + 1).fill(0);
for (let i = 1; i <= arr.length; i++) {
    prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
}
console.log(prefixSum)

let ans = 0;
for (let i = 1; i < prefixSum.length; i++) {
    for (let j = i; j < prefixSum.length; j++) {
        let len = j - i + 1;
        if (len % 2 != 0) {
            ans += (prefixSum[j] - prefixSum[i - 1])
        }
    }
}



console.log(ans)