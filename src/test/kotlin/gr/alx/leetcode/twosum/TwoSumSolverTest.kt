package gr.alx.leetcode.twosum

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TwoSumSolverTest {
    @Test
    fun `should find indexes case 1`() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9

        val indexes = Solution().twoSum(nums, target)

        assertThat(indexes).containsExactly(0, 1)
    }

    @Test
    fun `should find indexes case 2`() {
        val nums = intArrayOf(11, 15, 2, 7)
        val target = 9

        val indexes = Solution().twoSum(nums, target)

        assertThat(indexes).containsExactly(2, 3)
    }
}
