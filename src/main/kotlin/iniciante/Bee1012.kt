package iniciante

import kotlin.math.pow

fun main(){

    /*val numeros = readLine()!!.split(" ").map{ it.toDouble() }

    val areaTrianguloRetangulo = (numeros[0] * numeros[2])/2
    val areaDoCirculo = 3.14159 * numeros[2].pow(2)
    val areaDoTrapezio = ((numeros[0] + numeros[1]) * numeros[2])/2
    val areaDoQuadrado = numeros[1] * numeros[1]
    val areaDoRetangulo = numeros[0] * numeros[1]

    println("TRIANGULO: %.3f".format(areaTrianguloRetangulo))
    println("CIRCULO: %.3f".format(areaDoCirculo))
    println("TRAPEZIO: %.3f".format(areaDoTrapezio))
    println("QUADRADO: %.3f".format(areaDoQuadrado))
    println("RETANGULO: %.3f".format(areaDoRetangulo))*/

 val numeros = readLine()!!.split(" ").map{ it.toDouble() }
 val a = numeros[0]
 val b = numeros[1]
 val c = numeros[2]

 val areaTrianguloRetangulo = (a * c)/2.0
 val areaDoCirculo = 3.14159 * c.pow(2)
 val areaDoTrapezio = (a + b)*c/2
 val areaDoQuadrado = b * b
 val areaDoRetangulo = a * b

 println("TRIANGULO: %.3f".format(areaTrianguloRetangulo))
 println("CIRCULO: %.3f".format(areaDoCirculo))
 println("TRAPEZIO: %.3f".format(areaDoTrapezio))
 println("QUADRADO: %.3f".format(areaDoQuadrado))
 println("RETANGULO: %.3f".format(areaDoRetangulo))

}