package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var str = "NO"
        var q = 0
        val a = a.toUpperCase()
        for (i in 0..b.length - 1)
        {
            for (j in q..a.length - 1)
            {
                if (b[i].equals(a[j]))
                {
                    str = "YES"
                    q = j
                    break
                }
                else str = "NO"
            }
            if (str.equals("NO")) break
        }
        return str
        throw NotImplementedError("Not implemented")
    }
}
