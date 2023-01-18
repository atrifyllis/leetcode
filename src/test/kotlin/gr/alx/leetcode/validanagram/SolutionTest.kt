package gr.alx.leetcode.validanagram

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should run case 1`() {
        val s = "at"
        val t = "ta"

        val isAnagram = Solution().isAnagram(s, t)

        assertThat(isAnagram).isTrue()
    }

    @Test
    fun `should run case 2`() {
        val s = "anagram"
        val t = "nagaram"

        val isAnagram = Solution().isAnagram(s, t)

        assertThat(isAnagram).isTrue()
    }

    @Test
    fun `should run case 3`() {
        val s = "rat"
        val t = "car"

        val isAnagram = Solution().isAnagram(s, t)

        assertThat(isAnagram).isFalse()
    }

    @Test
    fun `should run case 4`() {
        val s = "aacc"
        val t = "ccac"

        val isAnagram = Solution().isAnagram(s, t)

        assertThat(isAnagram).isFalse()
    }
}
