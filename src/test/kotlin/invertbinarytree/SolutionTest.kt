package invertbinarytree

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should run case 1`() {
        var ti = TreeNode(2)
        ti.left = TreeNode(1)
        ti.right =TreeNode(3)

        val inverted = Solution().invertTree(ti)

        assertThat(inverted?.value).isEqualTo(2)
        assertThat(inverted?.left?.value).isEqualTo(3)
        assertThat(inverted?.right?.value).isEqualTo(1)
    }
}
