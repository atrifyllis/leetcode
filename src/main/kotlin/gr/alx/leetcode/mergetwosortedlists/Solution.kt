package gr.alx.leetcode.mergetwosortedlists

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */


class ListNode(var `val`: Int) {
    var next: ListNode? = null


}

class Solution {

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var sortedElements = listOf<Int>()
        list1?.let {
            sortedElements = sortedElements.plus(list1.flatElements())
        }
        list2?.let {
            sortedElements = sortedElements.plus(list2.flatElements())
        }
        return of(sortedElements.sorted())
    }

    companion object {
        fun of(elements: List<Int>): ListNode? {
            if (elements.isEmpty()) {
                return null
            }
            val listNode = ListNode(elements[0])
            var nextNode = listNode
            elements.drop(1).forEach {
                val node = ListNode(it)
                nextNode.next = node
                nextNode = node
            }

            return listNode
        }
    }
}


fun ListNode.value(): Int {
    return this.`val`
}

fun ListNode.flatElements(): List<Int> {
    val elements = mutableListOf<Int>()
    var listNode = this
    elements.add(this.value())

    while (listNode.next != null) {
        elements.add(listNode.next!!.value())
        listNode = listNode.next!!
    }

    return elements
}



