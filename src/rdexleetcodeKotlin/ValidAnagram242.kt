package rdexleetcodeKotlin

/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
 */

// the length check short circuts the sorting checks,
// runs long b/c both strings need to be converted to lists and sorted.

class ValidAnagram242 {
    fun isAnagram(s: String, t: String): Boolean {
        return s.length == t.length && s.toList().sorted() == t.toList().sorted()
    }
}