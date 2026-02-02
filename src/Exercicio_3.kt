fun main() {
    val idade = 56

    val natalidade = when {

        idade > 60 -> "Idoso"
        idade >= 18 -> "Adulto"
        idade >= 12 -> "Adolescente"
        else -> "Criança"

    }

    println(natalidade)
}