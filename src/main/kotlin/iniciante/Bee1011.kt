package iniciante
import kotlin.math.pow
//Bee 1011 - Esfera
fun main(){

    val raio = readLine()!!.toDouble()
    val volume = (4.0/3) * 3.14159 * raio.pow(3)
    println("VOLUME = %.3f".format(volume))
}