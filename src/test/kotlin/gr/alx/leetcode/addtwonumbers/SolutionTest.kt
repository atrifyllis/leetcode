package gr.alx.leetcode.addtwonumbers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should add numbers case 1`() {
        var two = ListNode(2)
        val four = ListNode(4)
        val three = ListNode(3)

        val five = ListNode(5)
        val six = ListNode(6)
        val four2 = ListNode(4)

        two.next = four
        four.next = three

        five.next = six
        six.next = four2

        val sum = Solution().addTwoNumbers(two, five)

        assertThat(sum).isEqualTo(807)
    }

    @Test
    fun `should sum`() {
        var sum = 4 + 5
        println(sum /10 )
    }
}
