package invertbinarytree

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
    fun invertTree(root: TreeNode?): TreeNode? {
        var current = root

        var tempLeft = current?.left
        var tempRight = current?.right

        current?.left = tempRight
        current?.right = tempLeft

        return current
    }
}

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
