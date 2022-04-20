package iniciante

import java.lang.Math.abs

// Bee1013 - O maior
fun main(){
    val valores = readLine()!!.split(" ").map{ it.toInt() }
    val a = valores[0]
    val b = valores[1]
    val c = valores[2]

    val maiorAB = (a + b + abs(a - b))/2
    val maior = (maiorAB + c + abs(maiorAB - c))/2

    println("$maior eh o maior")
}