fun main() {
    val array = arrayOf(5,8,2,10,3)
    var maiorNumero = 0

    for (i in 0 until array.size)
        if (array[i] > maiorNumero) maiorNumero = array[i]


    println(maiorNumero)
}