package iniciante

import javax.swing.text.html.HTML.Attribute.N

//Bee1018 - Cédulas

fun main(args: Array<String>) {
    contaNotas()
}

fun contaNotas(){
    var N = readLine()!!.toInt()
    var cedulas = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var qtdCedulas = 0

    println(N)
    for(i in cedulas){
        qtdCedulas = N / i
        println("$qtdCedulas nota(s) de R$ $i,00")
        N = N%i
    }
}