function isIsomorphic(s, t) {
    // Check if lengths are different
    if (s.length !== t.length) return false;
    
    // Create two maps for character mappings
    const sToT = new Map();
    const tToS = new Map();
    
    // Iterate through both strings
    for (let i = 0; i < s.length; i++) {
        const charS = s[i];
        const charT = t[i];
        
        // Check s to t mapping
        if (!sToT.has(charS)) {
            sToT.set(charS, charT);
        } else if (sToT.get(charS) !== charT) {  
            return false;
        }
        
        // Check t to s mapping (to ensure no two chars map to same char)
        if (!tToS.has(charT)) {
            tToS.set(charT, charS);
        } else if (tToS.get(charT) !== charS) {
            return false;
        }
    }
    
    return true;
}

// Example usage:
console.log(isIsomorphic("egg", "add")); // true
console.log(isIsomorphic("foo", "bar")); // false
console.log(isIsomorphic("paper", "title")); // true