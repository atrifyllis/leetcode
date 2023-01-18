package gr.alx.leetcode.validanagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if (s.length != t.length) return false

        val charAppearance = mutableMapOf<Char, Int>()

        s.forEach {
            charAppearance[it] = charAppearance[it]?.plus(1) ?: 1
        }

        t.forEach {
            if (charAppearance[it] != null) {
                charAppearance[it] = charAppearance[it]?.minus(1) ?: 0
            }
        }

        return charAppearance.values.none { it > 0 }
    }
}
