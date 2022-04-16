package iniciante

import java.text.DecimalFormat

//Bee1002
//Área do Círculo

fun main(args: Array<String>) {
    val raio = readLine()!!.toDouble()
    val n = 3.14159
    val area = n * (raio * raio)
    println("A=%.4f".format(area))
}