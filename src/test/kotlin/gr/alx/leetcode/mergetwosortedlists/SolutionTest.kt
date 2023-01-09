package gr.alx.leetcode.mergetwosortedlists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should run case 1`() {
        val list1 = Solution.of(listOf(1, 2, 4))
        val list2 = Solution.of(listOf(1, 3, 4))


        val list3 = Solution().mergeTwoLists(list1, list2)

        assertThat(list3!!.flatElements()).containsExactly(1, 1, 2, 3, 4, 4)
    }

    @Test
    fun `should run case 2`() {
        val list1 = Solution.of(listOf())
        val list2 = Solution.of(listOf(0))


        val list3 = Solution().mergeTwoLists(list1, list2)

        assertThat(list3!!.flatElements()).containsExactly(0)
    }

    @Test
    fun `should run case 3`() {
        val list1 = Solution.of(listOf())
        val list2 = Solution.of(listOf())


        val list3 = Solution().mergeTwoLists(list1, list2)

        assertThat(list3).isNull()
    }
}
