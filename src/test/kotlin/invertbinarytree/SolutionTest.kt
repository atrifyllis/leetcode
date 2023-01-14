package invertbinarytree

import gr.alx.leetcode.invertbinarytree.Solution
import gr.alx.leetcode.invertbinarytree.TreeNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun `should run case 1`() {
        val ti = TreeNode(2)
        ti.left = TreeNode(1)
        ti.right = TreeNode(3)

        val inverted = Solution().invertTree(ti)

        assertThat(inverted?.value).isEqualTo(2)
        assertThat(inverted?.left?.value).isEqualTo(3)
        assertThat(inverted?.right?.value).isEqualTo(1)
    }

    @Test
    fun `should run case 2`() {
        val tiLeft = TreeNode(2)
        tiLeft.left = TreeNode(1)
        tiLeft.right = TreeNode(3)

        val tiRight = TreeNode(7)
        tiRight.left = TreeNode(6)
        tiRight.right = TreeNode(9)

        val ti = TreeNode(4)
        ti.left = tiLeft
        ti.right = tiRight

        val inverted = Solution().invertTree(ti)

        assertThat(inverted?.value).isEqualTo(4)
        assertThat(inverted?.left?.value).isEqualTo(7)
        assertThat(inverted?.left?.left?.value).isEqualTo(9)
        assertThat(inverted?.left?.right?.value).isEqualTo(6)
        assertThat(inverted?.right?.left?.value).isEqualTo(3)
        assertThat(inverted?.right?.right?.value).isEqualTo(1)
    }
}
