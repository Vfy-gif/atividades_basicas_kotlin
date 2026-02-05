fun main() {
    val idade = 11

    val natalidade = when {

        idade >= 60 -> "Idoso"
        idade >= 18 -> "Adulto"
        idade >= 12 -> "Adolescente"
        idade >= 1  -> "Criança"
        else        ->  "Idade inválida"

    }

    println(natalidade)


//    val natalidade = when (idade){
//        in 0 .. 12 -> "Criança"
//        in 13 .. 17 -> "Adolescente"
//        in 18 .. 59 -> "Adulto"
//        else        ->  if(idade >= 60) "Idoso" else "Idade inválida"
//    }
}