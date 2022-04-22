package iniciante

//Bee 1017 - Gasto de Combustível

fun main(){
    val tempoHoras = readLine()!!.toInt()
    val velocidadeMedia = readLine()!!.toInt()

    val distancia= tempoHoras * velocidadeMedia
    val litros:Float = (distancia.toFloat() / 12.toFloat())

    println("%.3f".format(litros))

}