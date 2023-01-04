package gr.alx.leetcode.lengthoflongestsubstring

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val input: List<String> = s.split("").filter { it.isNotEmpty() }

        val charToIndexMap = HashMap<String, Int>()

        var leftPointer = 0
        var rightPointer = 0
        var maxLength = 0

        for (rightPointer in input.indices) {
            val currentChar: String = input[rightPointer]
            val currentCharIndex: Int? = charToIndexMap[currentChar]
            // if we have already seen this character,
            // move left pointer to the right of the current character (avoid consecutive duplicates)
            if (currentCharIndex != null) {
                leftPointer = maxOf(leftPointer, currentCharIndex + 1)
            }
            // always set or replace currentChar index in hash map
            charToIndexMap[currentChar] = rightPointer
            // since we already moved leftPointer, we add 1 to find the length.
            maxLength = maxOf(rightPointer - leftPointer + 1, maxLength)

        }
        return maxLength
    }
}
