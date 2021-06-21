package subtask2

import com.sun.org.apache.xpath.internal.operations.Bool
import subtask1.DateFormatter

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var temp = a.toUpperCase()
        var i = 0
        while (i < temp.length) {
            var cur = false

            for (ib in b.indices) {
                if (temp[i] == b[ib]) {
                    cur = true
                }
            }
            if (!cur) {
                temp = temp.removeRange(i, i + 1)
            } else
                i++
        }

        if (temp == b) return "YES" else return "NO"

    }
}

fun main() {
    val v = Abbreviation()
    println(v.abbreviationFromA("mnbTy", "BT"))
}
