function isAnagram(s, t) {
    // If lengths differ, they can't be anagrams
    if (s.length !== t.length) return false;

    // Create a frequency map for characters in s
    const charCount = new Map();

    // Count characters in s
    for (let char of s) {
        charCount.set(char, (charCount.get(char) || 0) + 1);
    }

    // Subtract counts for characters in t
    for (let char of t) {
        if (!charCount.has(char)) return false;
        charCount.set(char, charCount.get(char) - 1);
        if (charCount.get(char) === 0) charCount.delete(char);
    }

    // If map is empty, all characters matched
    return charCount.size === 0;
}

let s = "anagram";
let t = "nagaram";
console.log(isAnagram(s, t)); // Output: true
