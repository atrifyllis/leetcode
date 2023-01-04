package gr.alx.leetcode.addtwonumbers

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var sumNode: ListNode? = ListNode(0)
        var next1 = l1
        var next2 = l2
        var sum = 0
        var carry = 0
        var temp = sumNode

        while (next1 != null || next2 != null || carry > 0) {
            sum = (next1.value() + next2.value() + carry) % 10
            carry = (next1.value() + next2.value()+ carry) / 10
            temp?.next = ListNode(sum)
            temp = temp.next()
            next1 = next1.next()
            next2 = next2.next()
        }
        return sumNode?.next
    }

}

fun ListNode?.value() = this?.`val` ?: 0
fun ListNode?.next(): ListNode? = this?.next ?: null
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
