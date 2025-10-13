let s = "abc", t = "ahbgdc";
let j = 0;
for (let i = 0; i < t.length; i++) {
    if (t[i] === s[j]) {
        j++
    }
}
console.log(j === s.length)
