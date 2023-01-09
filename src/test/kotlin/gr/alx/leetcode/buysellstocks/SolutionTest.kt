package gr.alx.leetcode.buysellstocks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should pass test case 1`() {

        val maxProfit = Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))

        assertThat(maxProfit).isEqualTo(5)
    }

    @Test
    fun `should pass test case 2`() {

        val maxProfit = Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1))

        assertThat(maxProfit).isEqualTo(0)
    }

    @Test
    fun `should pass test case 3`() {

        val maxProfit = Solution().maxProfit(intArrayOf(2, 4, 1))

        assertThat(maxProfit).isEqualTo(2)
    }


    @Test
    fun `should pass test case 4`() {

        val maxProfit = Solution().maxProfit(intArrayOf(2, 4, 1, 4))

        assertThat(maxProfit).isEqualTo(3)
    }

}
