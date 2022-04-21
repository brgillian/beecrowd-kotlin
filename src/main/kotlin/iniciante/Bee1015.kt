package iniciante
//Bee1015 - Distância entre dois pontos
import kotlin.math.pow

fun main(){

    val p1 = readLine()!!.split(" ").map{ it.toDouble() }
    val p2 = readLine()!!.split(" ").map{ it.toDouble() }

    val x1 = p1[0]
    val y1 = p1[1]
    val x2 = p2[0]
    val y2 = p2[1]

    val calculo = Math.sqrt(((x2 - x1).pow(2)) + ((y2 - y1).pow(2)))

    println("%.4f".format(calculo))
}