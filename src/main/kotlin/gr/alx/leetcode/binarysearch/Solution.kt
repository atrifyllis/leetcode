package gr.alx.leetcode.binarysearch

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val middleIndex = (right + left) / 2

            if (nums[middleIndex] == target) {
                return middleIndex
            } else if (target > nums[middleIndex]) {
                left = middleIndex + 1
            } else {
                right = middleIndex - 1
            }
        }
        return -1
    }
}
