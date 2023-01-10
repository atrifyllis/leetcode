package gr.alx.leetcode.validpalindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        val filteredInput = filter(s)
        if (filteredInput.isEmpty()) return true
        var chunked: List<String>
        if (isLengthEven(filteredInput)) {
            chunked = filteredInput.chunked(filteredInput.length / 2)
            return chunked[0] == chunked[1].reversed()

        } else {
            val firstChunk = filteredInput.substring(0, filteredInput.length / 2)
            val secondChunk = filteredInput.substring(filteredInput.length / 2 + 1, filteredInput.length)
            return firstChunk == secondChunk.reversed()
        }

    }

    private fun isLengthEven(filteredInput: String) = filteredInput.length % 2 == 0

    fun filter(input: String): String {
        return input
            .filter { it.isDigit() || it.isLetter() }
            .toLowerCase()
            .trim()
    }

    fun isPalindrome2KotlinSimple(s: String) = s.filter { it.isLetterOrDigit() }.let { it.equals(it.reversed(), true) }


    fun isPalindromeFromJava(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        var head = 0
        var tail = s.length - 1
        var cHead: Char
        var cTail: Char

        while (head <= tail) {
            cHead = s[head]
            cTail = s[tail]

            if (!Character.isLetterOrDigit(cHead)) {
                head++
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--
            } else {
                if (cHead.lowercaseChar() != cTail.lowercaseChar()) {
                    return false
                }
                head++
                tail--
            }
        }
        return true
    }
}
