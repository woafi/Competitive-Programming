let s = "abbaca";

let st = [] //Stack

for (const c of s) {
    if (st.length != 0) {
        if (st.length != 0 && st[0] == c) {
            st.shift()
        }else{
            st.unshift(c)
        }
    } else {
        st.unshift(c)
    }
}

console.log(st.reverse())