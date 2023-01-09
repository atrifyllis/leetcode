package gr.alx.leetcode.buysellstocks

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxDiff = 0
        var leftIndex = 0

        for (rightIndex in prices.indices) {
            val currentDiff = prices[rightIndex] - prices[leftIndex]
            if (currentDiff < 0) {
                leftIndex = rightIndex // found a min move leftIndex to it
            } else {
                if (currentDiff > maxDiff) {
                    maxDiff = currentDiff // found new max diff
                }
            }
        }
        return maxDiff
    }
}
