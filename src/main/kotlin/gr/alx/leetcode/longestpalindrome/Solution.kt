package gr.alx.leetcode.longestpalindrome

class Solution {
    fun longestPalindrome(s: String): String {
        var longestPalindrome = s[0].toString()
        if (s.length == 1) return s

        for ((index, char) in s.withIndex()) {
            var left = index
            var right = index // check odd length palindromes (e.g. "aba")
            while (left >= 0 && right < s.length && s[left] == s[right]) {
                val currentPalindrome = s.substring(left, right + 1)
                if (currentPalindrome.length > longestPalindrome.length) {
                    longestPalindrome = currentPalindrome
                }
                left--
                right++
            }

            left = index
            right = index + 1 // only difference with above is that we reset left/right to check palindromes with even length (e.g "bb")
            while (left >= 0 && right < s.length && s[left] == s[right]) {
                val currentPalindrome = s.substring(left, right + 1)
                if (currentPalindrome.length > longestPalindrome.length) {
                    longestPalindrome = currentPalindrome
                }
                left--
                right++
            }
        }
        return longestPalindrome
    }
}
