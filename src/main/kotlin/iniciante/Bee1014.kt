package iniciante

//Bee 1014 - Consumo

fun main(){
    val x = readLine()!!.toInt()
    val y = readLine()!!.toFloat()

    val consumoMedio = x / y

    println("%.3f km/l".format(consumoMedio))
}