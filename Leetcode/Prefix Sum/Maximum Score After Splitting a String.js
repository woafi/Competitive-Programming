let s = "00111";
let one = 0;
for (let i = 0; i < s.length; i++) {
    if(s.charAt(i) == "1"){
        one++;
    }
}

let zero = 0;
let ans = 0;

for (let i = 0; i < s.length - 1; i++) {
    if(s.charAt(i) == "1"){
        one--;
    }
    if(s.charAt(i) == "0"){
        zero++;
    }

    ans = Math.max(ans, zero + one);   
}

console.log(ans)

