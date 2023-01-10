package gr.alx.leetcode.validpalindrome

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should filter out invalid characters`() {
        val input = "A man, a plan, a canal: Panama ? > /"

        val filteredInput: String = Solution().filter(input)

        assertThat(filteredInput).isEqualTo("amanaplanacanalpanama")
    }

    @Test
    fun `should test case 1`() {
        val input = "ababa"

        val isPalindrome: Boolean = Solution().isPalindrome(input)


        assertThat(isPalindrome).isTrue()
    }

    @Test
    fun `should test case 2`() {
        val input = "abba"

        val isPalindrome: Boolean = Solution().isPalindrome(input)


        assertThat(isPalindrome).isTrue()
    }

    @Test
    fun `should test case 3`() {
        val input = "abbc"

        val isPalindrome: Boolean = Solution().isPalindrome(input)


        assertThat(isPalindrome).isFalse()
    }

    @Test
    fun `should test case 4`() {
        val input = "A man, a plan, a canal: Panama"

        val isPalindrome: Boolean = Solution().isPalindrome(input)


        assertThat(isPalindrome).isTrue()
    }
}
