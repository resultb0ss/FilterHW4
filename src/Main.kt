fun main() {
    val prizeMap: Map<Int,Int> = mapOf(
        134 to 100,
        234 to 54,
        35 to 44,
        434 to 34,
        55 to 23,
        65 to 43,
        73 to 23,
        82 to 12,
        92 to 34,
        102 to 23,
        131 to 56,
        1525 to 45
    )

    val filterMap: Map<Int,Int> = prizeMap.filter { (key,value) ->(key.toString().endsWith('5')) && (value > 20)}

    println(filterMap)

}