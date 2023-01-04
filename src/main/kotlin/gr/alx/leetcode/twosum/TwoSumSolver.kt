package gr.alx.leetcode.twosum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        // store "target - num" as a key and index of num as a value
        val diffToIndexMap: MutableMap<Int, Int> = mutableMapOf()

        nums.forEachIndexed { index, num ->
            diffToIndexMap[num]?.let {
                return intArrayOf( it, index)
            }
            diffToIndexMap[target - num] = index
        }
        return intArrayOf()
    }
}
