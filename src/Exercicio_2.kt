fun main() {
    val valor = -3

    val resultado = when {
        valor > 0   -> "Este valor $valor é positivo"
        valor == 0  -> "Este valor $valor é zero"
        else        -> "Este valor $valor é negativo"
    }

    println(resultado)
}