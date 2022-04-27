package iniciante

//Bee1021 - Notas e Moedas
//Notas: 100, 50, 20, 10, 5, 2
//Modedas: 1, 0.50, 0.25, 0.10, 0.05 e 0.01

fun main(){
    var input = readLine()!!.toDouble()
    var qtdDinheiro = 0

    println("NOTAS:")
    qtdDinheiro =  input.toInt() / 100
    println("$qtdDinheiro nota(s) de R$ 100.00")
    input = input % 100.0

    qtdDinheiro =  input.toInt() / 50
    println("$qtdDinheiro nota(s) de R$ 50.00")
    input = input % 50.0

    qtdDinheiro =  input.toInt() / 20
    println("$qtdDinheiro nota(s) de R$ 20.00")
    input = input % 20.0

    qtdDinheiro =  input.toInt() / 10
    println("$qtdDinheiro nota(s) de R$ 10.00")
    input = input % 10.0

    qtdDinheiro =  input.toInt() / 5
    println("$qtdDinheiro nota(s) de R$ 5.00")
    input = input % 5.0

    qtdDinheiro =  input.toInt() / 2
    println("$qtdDinheiro nota(s) de R$ 2.00")
    input = input % 2.0

    input = input * 100.0
    println("MOEDAS:")

    qtdDinheiro =  input.toInt() / 100
    println("$qtdDinheiro moeda(s) de R$ 1.00")
    input = input % 100.0

    qtdDinheiro =  input.toInt() / 50
    println("$qtdDinheiro moeda(s) de R$ 0.50")
    input = input % 50.0

    qtdDinheiro =  input.toInt() / 25
    println("$qtdDinheiro moeda(s) de R$ 0.25")
    input = input % 25.0

    qtdDinheiro =  input.toInt() / 10
    println("$qtdDinheiro moeda(s) de R$ 0.10")
    input = input % 10.0

    qtdDinheiro =  input.toInt() / 5
    println("$qtdDinheiro moeda(s) de R$ 0.05")
    input = input % 5.0

    qtdDinheiro =  input.toInt() / 1
    println("$qtdDinheiro moeda(s) de R$ 0.01")
    input = input % 1.0
 }



