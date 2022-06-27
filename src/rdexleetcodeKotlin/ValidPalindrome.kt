package rdexleetcodeKotlin

import java.util.*

/* A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
*/

class ValidPalindrome {
    fun isPalindrome(s: String): Boolean {
        val t = s.lowercase(Locale.getDefault()).replace("[^a-z0-9]".toRegex(), "")
        return t == t.reversed()
    }
}