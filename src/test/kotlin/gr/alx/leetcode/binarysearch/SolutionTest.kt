package gr.alx.leetcode.binarysearch

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should test case 1`() {

        val nums = intArrayOf(-1, 0, 3)

        val indexFound = Solution().search(nums, 3)

        assertThat(indexFound).isEqualTo(2)
    }

    @Test
    fun `should test case 2`() {

        val nums = intArrayOf(-1, 0, 3, 5, 9, 12)

        val indexFound = Solution().search(nums, 2)

        assertThat(indexFound).isEqualTo(-1)
    }
}
