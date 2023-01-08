import java.util.*

class Solution {
    fun isValid(s: String): Boolean {


        val stack: Stack<Char> = Stack()

        for (c in s) {
            when (c) {
                // keep open brackets in stack
                '(', '{', '[' -> stack.push(c)
                // when close bracket is found pop from stack if available
                // if not, throw
                ')', '}', ']' -> if (!stack.empty() && stack.peek() == opening(c)) stack.pop() else return false
            }
        }

        return stack.size == 0
    }

    private fun opening(c: Char): Char {
        return when (c) {
            ')', '(' -> '('
            '}', '{' -> '{'
            ']', '[' -> '['
            else -> throw IllegalArgumentException()
        }
    }
}
