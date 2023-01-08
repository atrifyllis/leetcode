package gr.alx.leetcode.validparenthesis

import Solution
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should test case 1`() {
        val valid = Solution().isValid("()")

        assertThat(valid).isTrue()
    }

    @Test
    fun `should test case 2`() {
        val valid = Solution().isValid("()[]{}")

        assertThat(valid).isTrue()
    }

    @Test
    fun `should test case 3`() {
        val valid = Solution().isValid("(]")

        assertThat(valid).isFalse()
    }

    @Test
    fun `should test case 4`() {
        val valid = Solution().isValid("([)]")

        assertThat(valid).isFalse()
    }

    @Test
    fun `should test case 5`() {
        val valid = Solution().isValid("]")

        assertThat(valid).isFalse()
    }
}
