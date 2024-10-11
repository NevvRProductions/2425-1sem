fun repeatedChars(n: Int, c: Char): String{
    var res = ""
    repeat(n) { res += c }
    return res
}

fun stringOf(r: IntRange): String{
    var res = ""
    for (n in r){
        res += n
    }
    return res
}

fun countSymbol(p: String, c: Char): Int{
    var count = 0
    for (char in p){
        if (char == c) count++
    }
    return count
}

fun genSecretPairs(): String{
    var pairs = ""
    while (pairs.length < SIZE_PAIRS) {
        val sym = SYMBOLS.random()
        if (countSymbol(pairs, sym)<2)
            pairs += sym
    }
    return pairs
}

fun validIndex(idx: Char): Boolean {
    if (idx !in '0'..'9') return false
    return (idx-'0') in 0..<SIZE_PAIRS
}

fun readPlay(pairs: String): String{
    var line: String
    do {
        print("$pairs -> ")
        line = readln().trim()
    } while (
        line.length != 2 ||
        !validIndex(line[0]) ||
        !validIndex(line[1])
    )
    return line
}

fun showPair(secret: String, showed: String, first: Int, second: Int): String {
    return showed
}
