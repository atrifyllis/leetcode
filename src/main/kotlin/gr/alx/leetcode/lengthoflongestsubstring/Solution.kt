package gr.alx.leetcode.lengthoflongestsubstring

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val input: List<String> = s.split("").filter { !it.isEmpty() }

        var leftPointer = 0
        var rightPointer = 0
        var currentSubString = HashSet<String>()

        for (leftPointer in 0 until input.size) {
            if (currentSubString.add(input[rig htPointer])) {
                rightPointer++
            }
        }

    }
}
