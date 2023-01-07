package gr.alx.leetcode.longestpalindrome

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should run case 1`() {
        val longestPalindrome = Solution().longestPalindrome("babad")

        assertThat(longestPalindrome).isEqualTo("bab")
    }

    @Test
    fun `should run case 2`() {
        val longestPalindrome = Solution().longestPalindrome("cbbd")

        assertThat(longestPalindrome).isEqualTo("bb")
    }

    @Test
    fun `should run case 3`() {
        val longestPalindrome = Solution().longestPalindrome("a")

        assertThat(longestPalindrome).isEqualTo("a")
    }

    @Test
    fun `should run case 4`() {
        val longestPalindrome = Solution().longestPalindrome("babadcbbcdv")

        assertThat(longestPalindrome).isEqualTo("dcbbcd")
    }

    @Test
    fun `should run case 5`() {
        val longestPalindrome = Solution().longestPalindrome("ac")

        assertThat(longestPalindrome).isEqualTo("a")
    }

    @Test
    fun `should run case 6`() {
        val longestPalindrome = Solution().longestPalindrome("bb")

        assertThat(longestPalindrome).isEqualTo("bb")
    }

    @Test
    fun `should run case 7`() {
        val longestPalindrome = Solution().longestPalindrome("aacabdkacaa")

        assertThat(longestPalindrome).isEqualTo("aca")
    }
}
