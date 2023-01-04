package gr.alx.leetcode.lengthoflongestsubstring

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should find longest substring case 1`() {
        val length = Solution().lengthOfLongestSubstring("abcabcbb")

        assertThat(length).isEqualTo(3)
    }

    @Test
    fun `should find longest substring case 2`() {
        val length = Solution().lengthOfLongestSubstring("bbbbb")

        assertThat(length).isEqualTo(1)
    }

    @Test
    fun `should find longest substring case 3`() {
        val length = Solution().lengthOfLongestSubstring("pwwkew")

        assertThat(length).isEqualTo(3)
    }

    @Test
    fun `should find longest substring case 4`() {
        val length = Solution().lengthOfLongestSubstring("dvdf")

        assertThat(length).isEqualTo(3)
    }
}
