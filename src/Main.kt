fun main() {
//    val idade = 18
//
//    val mensagem = if(idade >= 18) "Maior de idade" else "Menor de idade"
//
//
//    println(mensagem)
////////////////////////////////////////////////////
//    val nota = 8
//
//    val mensagem = when (nota) {
//        9, 10 -> "Excelente"
//        7, 8 -> "Muito bom"
//        6 -> "Bom"
//        else -> "Reprovado"
//    }
//
//    println(mensagem)
////////////////////////////////////////////////////
//    val nota = 6
//
//    val mensagem = when {
//        nota >= 9 -> "Excelente"
//        nota >= 7 -> "Muito bom"
//        nota == 6 -> "Bom"
//        else -> "Reprovado"
//    }
//
//    println(mensagem)
////////////////////////////////////////////////////
//    var texto: String? = "joao"
//
//    texto = null
//
//    println(texto?.length)
////////////////////////////////////////////////////
//    val numeros = listOf(1, 2, 3, 3, 4)
//
//    println(numeros)
////
////    numeros[3] = 42
//////    numeros[0] = "joao"
//
//
//
//    println(numeros[5])
////////////////////////////////////////////////////
//    var numeros = mutableListOf(1, 2, 3, 3, 4)
//
//        println(numeros)
//
//    numeros[0] = 42
////    numeros[0] = "joao"
//
//    numeros.add(7)
//    numeros.removeAt(4)
//
//
//    println(numeros)
////////////////////////////////////////////////////
//    val cores = setOf("Azul", "Verde", "Azul", "Vermelho")
//
//    println(cores)
//
//    println(cores.elementAt(2))
////////////////////////////////////////////////////
//    val cores = mutableSetOf("Azul", "Verde", "Azul", "Vermelho")
//
//    println(cores)
//
//    cores.add("Laranja")
//    cores.remove("Verde")
//
//    println(cores)
////////////////////////////////////////////////////
//    val produtos = mapOf(
//        "pc" to "computador",
//        "cl" to "celular"
//    )
//
//
//
//    println(produtos["nt"])
////////////////////////////////////////////////////
//    val produtos = mutableMapOf(
//        "pc" to "computador",
//        "cl" to "celular"
//    )
//
//    println(produtos["nt"])
//    produtos["pc"] = "desktop"
//    produtos["nt"] = "notebook"
//    produtos.remove("cl")
//    println(produtos)
//
//    var i = 0
//
//    while (i < 10) {
//        println(i)
//
//        i++
//    }
////////////////////////////////////////////////////
//    var test = 1 .. 10
//
//    for (i in 1 .. 10 step 2) {
//        println(i)
//    }
////////////////////////////////////////////////////
//    var carros = listOf("corsa", "celta", "fusca")
//
//    for ((indice, carro) in carros.withIndex()) {
//        println("O modelo $carro está no indice $indice")
//    }
////////////////////////////////////////////////////
//    val intervalo = 1 .. 10
//
//    println(intervalo)
////////////////////////////////////////////////////
//    fun mandaSalve(nome: String = "mano") {
//        println("Salve $nome!")
//    }
//
//    mandaSalve("Godenot")
//    mandaSalve()
////////////////////////////////////////////////////
//    fun mandaSalve(nome: String, saudacao: String) {
//        println("Salve $nome! $saudacao")
//    }
//
//    mandaSalve("Vitor", "Tamo jundo!")
//    mandaSalve(saudacao = "Tudo bom?", nome = "pedro")
////////////////////////////////////////////////////
//    val soma: (a: Int, b: Int) -> Double = {x, y -> (x + y).toDouble()}
//
//    val result = soma(3,4)
//    println(result)
////////////////////////////////////////////////////
//    val numeros = (1 .. 10).toList()
//
//    val pares = numeros.filter { it % 2 == 0 }
//
//    println(pares)
////////////////////////////////////////////////////
//    val numeros = (1 .. 10).toList()
//
//    val dobrados = numeros.map { it * 2 }
//
//    println(dobrados)
////////////////////////////////////////////////////
//    val numeros = listOf(1,2,3,4,5)
//
//    val result = numeros.reduce { somaValores, numero ->
//        somaValores + numero
//    }
//
//    println(result)
////////////////////////////////////////////////////
//    val numeros = listOf(1,2,3,4,5)
//
//    val result = numeros.reduce { maiorValor, numero ->
//        if (numero > maiorValor)
//            numero
//        else
//            maiorValor
//    }
//
//    println(result)
////////////////////////////////////////////////////
////////////////////////////////////////////////////
//    val numeros = listOf(1,2,3,4,5)
//
//    val resultadoSomaDobroPares = numeros
//        .filter { numero -> numero % 2 == 0}
//        .map    {numeroPar -> numeroPar * 2}
//        .reduce { somaDobroPares, numeroParDobrado ->
//            somaDobroPares + numeroParDobrado
//        }
//
//    println(resultadoSomaDobroPares)
////////////////////////////////////////////////////
///////////////////////////////////////////////////
 //
}