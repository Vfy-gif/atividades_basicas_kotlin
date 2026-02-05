fun main() {
    val array = arrayOf(1,2,3,4,5,5)

    var total = array[0]

    for (i in 0 until array.size)
        if(array[i] % 2 == 0)  total = array[i] + total

    println("A soma dos pares é ${total}")

}