fun main() {
    val array = arrayOf(1,2,3,4,5,6)

    var total = 0

    for (i in 0 until array.size)
       total  = array[i] + total

    println("A soma total  é $total")

    // somaValores += numero

//    val somaValores = array.sum()
//    println(somaValores)
}