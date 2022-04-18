package iniciante

//Bee 1005 - Média 1

fun main(args: Array<String>) {

    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()

    val nota = ((a * 3.5) + (b * 7.5))/11

    println("MEDIA = %.5f".format(nota))

}