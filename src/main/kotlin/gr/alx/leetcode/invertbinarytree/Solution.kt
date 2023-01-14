package gr.alx.leetcode.invertbinarytree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    tailrec fun invertTree(current: TreeNode?): TreeNode? {
        if (current == null) return current

        invert(current)
        invertTree(current.left)
        invertTree(current.right)

        return current
    }

    private fun invert(current: TreeNode?) {
        val tempLeft = current?.left
        val tempRight = current?.right

        current?.left = tempRight
        current?.right = tempLeft


    }
}

data class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
